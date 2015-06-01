package com.mteng.polymorphism.shapes;

public class HalfCircle extends Circle {
    @Override
    public double area(double inputDim) {
        return super.area(inputDim)/2;
    }

    @Override
    public String getName() {
        return "Half Circle";
    }
}
