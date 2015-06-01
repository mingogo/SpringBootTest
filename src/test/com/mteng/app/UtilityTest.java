package com.mteng.app;

import org.junit.Test;

public class UtilityTest {
    Utility utility = new Utility();

    @Test
    public void testTransformString() throws Exception {
        System.out.println(
                utility.transformString("This is a input String")
        );
    }
}