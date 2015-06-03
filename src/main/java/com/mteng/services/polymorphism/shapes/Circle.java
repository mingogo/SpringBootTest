package com.mteng.services.polymorphism.shapes;

public class Circle implements Shape {
    public double area(double inputDim) {
        return Math.PI * Math.pow(inputDim / 2, 2);
    }

    public String getName() {
        return "Circle";
    }
}
