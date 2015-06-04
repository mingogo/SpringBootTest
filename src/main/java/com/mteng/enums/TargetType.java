package com.mteng.enums;

public enum TargetType {

    HOSTILE("hostile"),
    UNKNOWN("unknown"),
    FRIENDLY("friendly");

    private String targetType;

    private TargetType(String targetType) {
        this.targetType = targetType;
    }
}
