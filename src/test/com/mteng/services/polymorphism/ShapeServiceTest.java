package com.mteng.services.polymorphism;

import org.junit.Test;

public class ShapeServiceTest {
    double dim = 5;
    ShapeService ss = new ShapeService(dim);

    @Test
    public void testRunShapeService() throws Exception {
        double resultArea = ss.runShapeService();
        System.out.println("Total area is : " + resultArea);
    }
}