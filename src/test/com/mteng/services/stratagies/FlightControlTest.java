package com.mteng.services.stratagies;

import com.mteng.Application;
import com.mteng.enums.TargetWhereabout;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class FlightControlTest {

    @Autowired
    FlightControl control;
    @Autowired
    StrategyFiringMode strategyFiringAllCannon;
    @Autowired
    StrategyFiringMode strategyFiringSingleCannon;

    @Test
    public void testAttack() throws Exception {
        List<TargetWhereabout> situationList = generateCaseList();
        for (TargetWhereabout situation : situationList) {
            if (situation.equals(TargetWhereabout.CLOSE)) {
                control.attack(strategyFiringSingleCannon);
            } else {
                control.attack(strategyFiringAllCannon);
            }
        }
    }

    private List<TargetWhereabout> generateCaseList() {
        List<TargetWhereabout> caseList = new ArrayList<TargetWhereabout>();
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.CLOSE);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.FAR);
        caseList.add(TargetWhereabout.FAR);
        return caseList;
    }
}