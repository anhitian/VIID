package com.viid.common.util;

import com.viid.common.constant.ViidConstants;
import com.viid.common.enums.DispositionSubscribeNotificationType;
import com.viid.common.enums.VideoImageInfoAttributeType;
import com.viid.common.enums.VideoImageInfoType;
import com.viid.common.exception.IdGenerateOutOfBoundsException;
import org.apache.commons.lang3.StringUtils;
import org.redisson.api.RIdGenerator;
import org.redisson.api.RedissonClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * IdGenerator
 * id生成器 依赖redis
 * 由于1400 id定义上没有预留worker id类似的概念，此处不做考虑
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/16
 * @since 0.1.0
 */
@Component
@ConditionalOnBean(type = "org.redisson.api.RedissonClient")
public class IdGenerator {

    private final RedissonClient redissonClient;

    public IdGenerator(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }

    /**
     * 构建视频案事件对象统一标识
     *
     * <pre>
     *    +------+-------+---------------------+------------------------------------+
     *    |  码段  |  码位   |         含义          |                取值说明                |
     *    +------+-------+---------------------+------------------------------------+
     *    | 机构编码 | 1-12  | 公安机关机构代码            | 公安机关机构代码，采用GA/T 543.1-2011中DE00060 |
     *    | 时间编码 | 13-26 | 表示视频案事件对象生成时间，精确到秒级 | YYYYMMDDhhmmss，年月日时分秒              |
     *    | 序号   | 27-30 | 视频案事件对象序号           |                                    |
     *    +------+-------+---------------------+------------------------------------+
     * </pre>
     *
     * @param publicSecurityInstitution 公安机关机构代码
     * @return id
     */
    public String generateCaseObjectId(String publicSecurityInstitution) throws IdGenerateOutOfBoundsException {
        Assert.isTrue(StringUtils.isNotEmpty(publicSecurityInstitution) && publicSecurityInstitution.length() == 12, "publicSecurityInstitution cannot be empty and length need to be 12");
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern(ViidConstants.DATE_TIME_FORMATTER_PATTERN));
        String prefix = publicSecurityInstitution + now;
        return generateId(prefix, 4);
    }

    /**
     * 生成图像信息基本要素ID，视频、图像、文件
     *
     * <pre>
     * +-------------+--------+-------------------------------------------------------------------------------------------------------------------+------------------------------------------+
     * |     码段      |   码位   |                                                        含义                                                         |                   取值说明                   |
     * +-------------+--------+-------------------------------------------------------------------------------------------------------------------+------------------------------------------+
     * | 设备编码/应用平台编码 | 1-20   | 1.对自动采集对象,应使用在线视频图像信息采集设备/系统、分析设备/系统统一标识编码；</br>2.对人工采集对象,应使用对应的公安视频图像信息应用平台或其他公安信息系统统一标识编码，包括所有通过数据服务接口接入视图库的系统。 | GB/T28181-2016附录D中D.1规定的编码规则             |
     * | 子类型编码       | 21-22  | 表示视频图像信息基本对象的类型                                                                                                   | 01-视频片段</br> 02-图像</br> 03-文件</br> 99-其他 |
     * | 时间编码        | 23-36  | 表示视频图像信息基本对象生成时间，精确到秒级                                                                                            | YYYYMMDDhhmmss，年月日时分秒                    |
     * | 序号          | 37-41  | 视频图像信息基本对象序号                                                                                                      |                                          |
     * +-------------+--------+-------------------------------------------------------------------------------------------------------------------+------------------------------------------+
     * </pre>
     *
     * @param deviceId 设备编码/应用平台编码
     * @return id
     */
    public String generateBasicObjectId(String deviceId, VideoImageInfoType type) {
        Assert.notNull(type, "VideoImageInfoType cannot be null");
        Assert.isTrue(StringUtils.isNotEmpty(deviceId) && deviceId.length() == 20, "deviceId cannot be empty and length need to be 20");
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern(ViidConstants.DATE_TIME_FORMATTER_PATTERN));
        String prefix = deviceId + type.getCode() + now;
        return generateId(prefix, 5);
    }

    /**
     * 生成布控、订阅及相应通知管理对象ID
     * <pre>
     * +-------+-------+-------------------+------------------------------------+
     * |  码段   |  码位   |        含义         |                取值说明                |
     * +-------+-------+-------------------+------------------------------------+
     * | 机构编码  | 1-12  | 公安机关机构代码          | 公安机关机构代码，采用GA/T 543.1-2011中DE00060 |
     * | 子类型编码 | 13-14 | 表示类型              | 01-布/撤控 02-告警 03-订阅 04-通知 99-其它    |
     * | 时间编码  | 15-28 | 表示布控与订阅生成时间，精确到秒级 | YYYYMMDDhhmmss，年月日时分秒              |
     * | 序号    | 29-33 | 表示流水序号            |                                    |
     * +-------+-------+-------------------+------------------------------------+
     * </pre>
     *
     * @param publicSecurityInstitution 公安机关机构代码
     * @return id
     */
    public String generateBusinessObjectId(String publicSecurityInstitution, DispositionSubscribeNotificationType type) {
        Assert.notNull(type, "DispositionSubscribeNotificationType cannot be null");
        Assert.isTrue(StringUtils.isNotEmpty(publicSecurityInstitution) && publicSecurityInstitution.length() == 12, "publicSecurityInstitution cannot be empty and length need to be 12");
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern(ViidConstants.DATE_TIME_FORMATTER_PATTERN));
        String prefix = publicSecurityInstitution + type.getCode() + now;
        return generateId(prefix, 5);
    }

    /**
     * <pre>
     * +----------------+--------+---------------------------+--------------------------------------------------------+
     * |       码段       |   码位   |            含义             |                          取值说明                          |
     * +----------------+--------+---------------------------+--------------------------------------------------------+
     * | 视频图像信息基本对象统一标识 | 1-41   | 视频图像信息语义属性对象所属的视频图像信息基本对象 | 视频图像信息基本对象统一标识                                         |
     * | 子类型编码          | 42-43  | 表示视频图像信息语义属性对象的类型         | 01-人员 02-机动车 03-非机动车 04-物品 05-场景 06-人脸 07-视频图像标签 99-其他 |
     * | 序号             | 44-48  | 视频图像信息语义属性对象序号            |                                                        |
     * +----------------+--------+---------------------------+--------------------------------------------------------+
     * </pre>
     *
     * @param deviceId 设备编码/应用平台编码
     * @return id
     */
    public String generateImageContentObjectId(String deviceId, VideoImageInfoType videoImageInfoType, VideoImageInfoAttributeType attributeType) {
        Assert.notNull(videoImageInfoType, "VideoImageInfoType cannot be null");
        Assert.notNull(attributeType, "VideoImageInfoAttributeType cannot be null");
        Assert.isTrue(StringUtils.isNotEmpty(deviceId) && deviceId.length() == 20, "deviceId cannot be empty and length need to be 12");
        String basicObjectId = generateBasicObjectId(deviceId, videoImageInfoType);
        String prefix = basicObjectId + attributeType.getCode();
        return generateId(prefix, 5);
    }

    private String generateId(String prefix, Integer serialNumberMaxLength) throws IdGenerateOutOfBoundsException {
        RIdGenerator rIdGenerator = redissonClient.getIdGenerator(prefix);
        rIdGenerator.expire(Instant.ofEpochMilli(2000L));
        long id = rIdGenerator.nextId();
        if (id >= (long) Math.pow(10, serialNumberMaxLength)) {
            throw new IdGenerateOutOfBoundsException();
        }
        return prefix + StringUtils.leftPad(String.valueOf(id), serialNumberMaxLength, '0');
    }
}
