/*
 * Copyright (c) 2020 qian.he Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * VehicleBrandType
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum VehicleBrandType {

    /**
     * 序号	消息中取值	说明
     * 1	0	其他
     * 2	1	大众
     * 3	2	别克
     * 4	3	宝马
     * 5	4	本田
     * 6	5	标致
     * 7	6	丰田
     * 8	7	福特
     * 9	8	日产
     * 10	9	奥迪
     * 11	10	马自达
     * 12	11	雪佛兰
     * 13	12	雪铁龙
     * 14	13	现代
     * 15	14	奇瑞
     * 16	15	起亚
     * 17	16	荣威
     * 18	17	三菱
     * 19	18	斯柯达
     * 20	19	吉利
     * 21	20	中华
     * 22	21	沃尔沃
     * 23	22	雷克萨斯
     * 24	23	菲亚特
     * 25	24	吉利帝豪
     * 26	25	东风
     * 27	26	比亚迪
     * 28	27	铃木
     * 29	28	金杯
     * 30	29	海马
     * 31	30	五菱
     * 32	31	江淮
     * 33	32	斯巴鲁
     * 34	33	英伦
     * 35	34	长城
     * 36	35	哈飞
     * 37	36	庆铃（五十铃）
     * 38	37	东南
     * 39	38	长安
     * 40	39	福田
     * 41	40	夏利
     * 42	41	奔驰
     * 43	42	一汽
     * 44	43	依维柯
     * 45	44	力帆
     * 46	45	一汽奔腾
     * 47	46	皇冠
     * 48	47	雷诺
     * 49	48	JMC
     * 50	49	MG名爵
     * 51	50	凯马
     * 52	51	众泰
     * 53	52	昌河
     * 54	53	厦门金龙
     * 55	54	上海汇众
     * 56	55	苏州金龙
     * 57	56	海格
     * 58	57	宇通
     * 59	58	中国重汽
     * 60	59	北奔重卡
     * 61	60	华菱星马汽车
     * 62	61	跃进汽车
     * 65	62	黄海汽车
     * 66	65	保时捷
     * 67	66	凯迪拉克
     * 68	67	英菲尼迪
     * 69	68	吉利全球鹰
     * 70	69	吉普
     * 71	70	路虎
     * 73	71	长丰猎豹
     * 75	73	时代汽车
     * 76	75	长安轿车
     * 81	76	陕汽重卡
     * 82	81	安凯
     * 83	82	申龙
     * 86	83	大宇
     * 87	86	中通
     * 88	87	宝骏
     * 89	88	北汽威旺
     * 90	89	广汽传祺
     * 92	90	陆风
     * 94	92	北京
     * 95	94	威麟
     * 96	95	欧宝
     * 97	96	开瑞
     * 103	97	华普
     * 104	103	讴歌
     * 107	104	启辰
     * 108	107	北汽制造
     * 109	108	纳智捷
     * 110	109	野马
     * 112	110	中兴
     * 113	112	克莱斯勒
     * 115	113	广汽吉奥
     * 117	115	瑞麟
     * 119	117	捷豹
     * 121	119	唐骏欧铃
     * 122	121	福迪
     * 124	122	莲花
     * 128	124	双环
     * 136	128	永源
     * 144	136	江南
     * 155	144	道奇
     * 167	155	大运汽车
     * 176	167	北方客车
     * 191	176	九龙
     * 201	191	宾利
     * 230	201	舒驰客车
     * 231	230	红旗
     */
    OTHER("0","其他");

    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    VehicleBrandType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
