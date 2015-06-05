package com.mteng.services.chainsOfResponsibility;

import com.mteng.Application;
import com.mteng.enums.TargetType;
import com.mteng.services.chainsOfResponsibility.dto.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TargetClientTest {

    @Autowired
    TargetClient client;

    @Test
    public void testClient() {
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