package com.ygyin.apiplatforminterface;

import com.ygyin.apiplatformsdk.client.ApiClient;
import com.ygyin.apiplatformsdk.model.SampleModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiPlatformInterfaceApplicationTests {

    @Resource
    private ApiClient client;

    @Test
    void contextLoads() {
        // get
        String getRes = client.getInfoByGet("yg");
        // post restful
        SampleModel model = new SampleModel();
        model.setModelInfo("ygyin");
        String sampleInfo = client.getSampleInfoByPost(model);

        System.out.println(getRes);
        System.out.println(sampleInfo);
    }

}
