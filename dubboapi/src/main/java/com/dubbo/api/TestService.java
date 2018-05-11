package com.dubbo.api;

import com.dubbo.model.Test;

public interface TestService {
    Test findTest(String message);
}
