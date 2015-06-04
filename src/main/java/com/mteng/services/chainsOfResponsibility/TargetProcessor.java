package com.mteng.services.chainsOfResponsibility;

import com.mteng.services.chainsOfResponsibility.dto.Target;
import com.mteng.services.chainsOfResponsibility.handlers.TargetHandler;
import org.springframework.stereotype.Service;

@Service
public class TargetProcessor {

    private TargetHandler prevTargetHandler;
    private TargetHandler first;

    public void addHandler(TargetHandler handler) {
        if (prevTargetHandler != null) {
            prevTargetHandler.setNext(handler);
        } else {
            this.first = handler;
        }
        prevTargetHandler = handler;
    }

    public void handleTarget(Target target) {
        try {
            first.handleTarget(target);
        } catch (NullPointerException ex) {
            System.out.println("Unknown target. ");
        }
    }
}
