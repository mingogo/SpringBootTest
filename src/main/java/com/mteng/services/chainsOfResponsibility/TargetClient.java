package com.mteng.services.chainsOfResponsibility;

import com.mteng.services.chainsOfResponsibility.dto.Target;
import com.mteng.services.chainsOfResponsibility.handlers.FriendlyTargetHandler;
import com.mteng.services.chainsOfResponsibility.handlers.HostileTargetHandler;
import com.mteng.services.chainsOfResponsibility.handlers.TargetHandler;
import org.springframework.stereotype.Service;

@Service
public class TargetClient {

    private TargetProcessor processor;

    public TargetClient() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new TargetProcessor();
        processor.addHandler(new FriendlyTargetHandler());
        processor.addHandler(new HostileTargetHandler());
    }

    public void addRule(TargetHandler handler) {
        processor.addHandler(handler);
    }

    public void TargetFound(Target target) {
        processor.handleTarget(target);
    }
}
