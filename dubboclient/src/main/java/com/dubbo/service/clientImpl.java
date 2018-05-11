package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.TestService;
import com.dubbo.model.Test;
import org.springframework.stereotype.Component;

@Component
public class clientImpl {
    @Reference(version = "1.0.0")
     TestService testservice;

    public void findTest() {
        String message ="这是一个dubbo的Test";
        Test test =testservice.findTest(message);
       System.out.println(test.getMassage());
    }
}
