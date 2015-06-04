package com.mteng.services.chainsOfResponsibility.handlers;

import com.mteng.services.chainsOfResponsibility.dto.Target;

public interface TargetHandler {
    public void setNext(TargetHandler handler);
    public void handleTarget(Target target);
}
