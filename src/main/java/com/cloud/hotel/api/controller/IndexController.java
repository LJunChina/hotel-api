package com.cloud.hotel.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页接口
 * @author Jon_China
 * @since 2019年11月30日15:55:37
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = "/init-data")
    public String initData(){
        return "{\n" +
                "  \"evalList\": [\n" +
                "    {\n" +
                "      \"evaluate\": \"入住舒适 服务好\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"evaluate\": \"入住舒适 服务好\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"lineTime\": \"00:00-24:00\",\n" +
                "  \"address\": \"重庆市九街按摩店\",\n" +
                "  \"imgUrls\": [\n" +
                "    \"../../imgs/index/banner.jpg\",\n" +
                "    \"../../imgs/index/banner.jpg\",\n" +
                "    \"../../imgs/index/banner.jpg\"\n" +
                "  ],\n" +
                "  \"indicatorDots\": true,\n" +
                "  \"autoplay\": true,\n" +
                "  \"interval\": 5000,\n" +
                "  \"duration\": 1000,\n" +
                "  \"houseList\": [\n" +
                "    {\n" +
                "      \"houseImg\": \"../../imgs/index/radius.jpg\",\n" +
                "      \"houseTxt\": \"单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"houseImg\": \"../../imgs/index/radius.jpg\",\n" +
                "      \"houseTxt\": \"双人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"houseImg\": \"../../imgs/index/radius.jpg\",\n" +
                "      \"houseTxt\": \"套房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"houseImg\": \"../../imgs/index/radius.jpg\",\n" +
                "      \"houseTxt\": \"圆床房\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"singleHouse\": [\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"singleImg\": \"../../imgs/index/house1.jpg\",\n" +
                "      \"singleTxt\": \"北欧风情单人房\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
