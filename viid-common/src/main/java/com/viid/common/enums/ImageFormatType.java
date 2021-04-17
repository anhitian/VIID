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
 * ImageFormatType
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum ImageFormatType {

    /**
     * 序号	消息中取值	说明
     * 1	Bmp	BMP
     * 2	Gif	GIF
     * 3	Jpeg	JPEG
     * 4	Jfif	JFIF
     * 5	Kdc	KDC
     * 6	Pcd	PCD
     * 7	Pcx	PCX
     * 8	Pic	PIC
     * 9	Pix	PIX
     * 10	Png	PNG
     * 11	Psd	PSD
     * 12	Tapga	TAPGA
     * 13	Tiff	TIFF
     * 14	Wmf	WMF
     * 15	Jp2	JPEG 2000
     * 16	Other	其他
     */
    BMP("Bmp", "BMP"),
    GIF("Gif", "GIF"),
    JPEG("Jpeg", "JPEG"),
    JFIF("Jfif", "JFIF"),
    KDC("Kdc", "KDC"),
    PCD("Pcd", "PCD"),
    PCX("Pcx", "PCX"),
    PIC("Pic", "PIC"),
    PIX("Pix", "PIX"),
    PNG("Png", "PNG"),
    TAPGA("Tapga", "TAPGA"),
    TIFF("Tiff", "TIFF"),
    WMF("Wmf", "WMF"),
    JPEG_2000("Jp2", "JPEG 2000"),
    OTHER("Other", "其他");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    ImageFormatType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
