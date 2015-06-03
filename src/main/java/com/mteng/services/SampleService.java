package com.mteng.services;

import com.mteng.util.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private AppUtils util;

    @Value("${mteng.sample.name}")
    private String name;

    public String produceString(String inputString) {
        return util.appendString(inputString);
    }

    public String getName() {
        return util.appendString(name);
    }
}
