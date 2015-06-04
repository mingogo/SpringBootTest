package com.mteng.services.chainsOfResponsibility.handlers;

import com.mteng.enums.TargetType;
import com.mteng.services.chainsOfResponsibility.dto.Target;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class FriendlyTargetHandler implements TargetHandler {

    final static Logger logger = Logger.getLogger(FriendlyTargetHandler.class);

    private TargetHandler next;

    @Override
    public void setNext(TargetHandler handler) {
        next = handler;
    }

    @Override
    public void handleTarget(Target target) {
        if (!target.getName().equals(TargetType.FRIENDLY)) {
            next.handleTarget(target);
        }else{
            logger.info("Friendly target found. Stop firing");
            System.out.println("Friendly target found. Stop firing");
        }
    }
}
