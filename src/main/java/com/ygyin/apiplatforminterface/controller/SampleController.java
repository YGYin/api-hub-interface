package com.ygyin.apiplatforminterface.controller;

import com.ygyin.apiplatformsdk.model.SampleModel;
import com.ygyin.apiplatformsdk.utils.SignatureUtil;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 示例用 API
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/get")
    public String getInfoByGet(String info) {
        return "GET 返回信息: " + info;
    }

    @PostMapping("/post")
    public String getInfoByPost(@RequestParam String info) {
        return "POST 返回信息: " + info;
    }

    /**
     * Restful
     *
     * @param sampleModel 用 Json 方式接受参数
     * @return
     */
    @PostMapping("/info")
    public String getSampleInfoByPost(@RequestBody SampleModel sampleModel, HttpServletRequest resq) {
//        String accessKey = resq.getHeader("accessKey");
//        String randomNum = resq.getHeader("randomNum");
////        String timestamp = resq.getHeader("timestamp");
//        String signature = resq.getHeader("signature");
//        String paramBody = resq.getHeader("paramBody");
//
//        // 对 ak，sk 做校验，正常应该从 db 中获取看是否分配对应 ak sk
//        if (!accessKey.equals("yygg"))
//            throw new RuntimeException("No Auth, wrong ak");
//
//        if (Long.parseLong(randomNum) > 10000)
//            throw new RuntimeException("No Auth, wrong randomNum");
//
//        // 签名时间和当前时间不能超过 xx min
//        // if(timestamp) {...}
//
//        // 实际应该从 db 中查该用户 secretKey
//        String serverSignature = SignatureUtil.generateSignature(paramBody, "abcabc");
//        if (!signature.equals(serverSignature))
//            throw new RuntimeException("No Auth, wrong signature");

        // 校验调用用户和校验调用接口已在 backend 中实现

        String resStr = "POST(Restful) 返回信息: " + sampleModel.getModelInfo();
        return resStr;
    }

}
