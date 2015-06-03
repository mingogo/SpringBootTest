package com.mteng.services;

import com.mteng.util.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    @Autowired
    AppUtils util;

    public String produceString(String inputString) {
        return util.appendString(inputString);
    }
}
