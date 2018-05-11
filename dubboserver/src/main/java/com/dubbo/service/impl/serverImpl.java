package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.TestService;
import com.dubbo.model.Test;


@Service(version = "1.0.0")
public class serverImpl implements TestService {

    public Test findTest(String message){
        Test test =new Test();
        test.setMassage(message);
        return test;
    }
}
