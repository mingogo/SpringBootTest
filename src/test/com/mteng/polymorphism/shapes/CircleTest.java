package com.mteng.polymorphism.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle c = new Circle();

    @Test
    public void testArea() throws Exception {
        double result = c.area(12);
        System.out.println(result);
    }
}