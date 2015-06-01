package com.mteng.polymorphism.shapes;

/**
 * Created by mteng on 6/1/2015.
 */
public class Square implements Shape{
    public double area(double inputDim) {
        return Math.pow(inputDim,2)/2;
    }

    public String getName() {
        return "Square";
    }
}
