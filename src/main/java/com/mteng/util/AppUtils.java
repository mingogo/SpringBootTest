package com.mteng.util;

import org.springframework.stereotype.Service;

@Service
public class AppUtils {
    public String appendString(String inputString) {
        return inputString + " with something else. ";
    }
}
