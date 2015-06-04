package com.mteng.services.chainsOfResponsibility;

import com.mteng.enums.TargetType;
import com.mteng.services.chainsOfResponsibility.dto.Target;
import com.mteng.services.chainsOfResponsibility.handlers.FriendlyTargetHandler;
import com.mteng.services.chainsOfResponsibility.handlers.HostileTargetHandler;
import com.mteng.services.chainsOfResponsibility.handlers.TargetHandler;
import org.springframework.beans.factory.annotation.Autowired;
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

    public static void main(String[] args) {
        TargetClient client = new TargetClient();
        Target t1 = new Target();
        t1.setName(TargetType.FRIENDLY);
        Target t2 = new Target();
        t2.setName(TargetType.HOSTILE);
        Target t3 = new Target();
        t3.setName(TargetType.UNKNOWN);

        client.TargetFound(t1);
        client.TargetFound(t2);
        client.TargetFound(t3);
    }
}
