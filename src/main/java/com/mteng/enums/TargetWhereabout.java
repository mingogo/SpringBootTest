package com.mteng.enums;

import lombok.Data;

public enum TargetWhereabout {
    FAR("far"),
    CLOSE("close");
    private String whereabout;
    private TargetWhereabout(String whereabout){
        this.whereabout = whereabout;
    }
}
