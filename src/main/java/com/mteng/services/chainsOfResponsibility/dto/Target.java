package com.mteng.services.chainsOfResponsibility.dto;

import com.mteng.enums.TargetType;
import com.mteng.enums.TargetWhereabout;
import lombok.Data;

@Data
public class Target {
    private TargetType name;
    private TargetWhereabout whereabout;
}
