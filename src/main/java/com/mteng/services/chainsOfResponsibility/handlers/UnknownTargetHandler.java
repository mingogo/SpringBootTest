package com.mteng.services.chainsOfResponsibility.handlers;

import com.mteng.enums.TargetType;
import com.mteng.services.chainsOfResponsibility.dto.Target;
import org.springframework.stereotype.Service;

@Service
public class UnknownTargetHandler implements TargetHandler {

    private TargetHandler next;

    @Override
    public void setNext(TargetHandler handler) {
        next = handler;
    }

    @Override
    public void handleTarget(Target target) {
        if (!target.getName().equals(TargetType.UNKNOWN)) {
            next.handleTarget(target);
        } else {
            System.out.println("Unknown target, waiting for flight control.");
        }
    }
}
