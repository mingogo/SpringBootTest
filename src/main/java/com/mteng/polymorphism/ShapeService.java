package com.mteng.polymorphism;

import com.mteng.polymorphism.shapes.Circle;
import com.mteng.polymorphism.shapes.HalfCircle;
import com.mteng.polymorphism.shapes.Shape;
import com.mteng.polymorphism.shapes.Square;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeService {
    double dim;
    List listShapes = new ArrayList(20);

    public ShapeService(double dim) {
        this.dim = dim;
    }

    public double runShapeService() {
        Shape s = new Circle();
        listShapes.add(s);
        s = new Square();
        listShapes.add(s);
        s = new HalfCircle();
        listShapes.add(s);
        double result = getTotalArea(listShapes, dim);
        return result;
    }

    private double getTotalArea(List listShapes, double dim) {
        double totalArea = 0.0;
        Iterator it = listShapes.iterator();
        while (it.hasNext()) {
            Shape s = (Shape) it.next();
            System.out.println("The area of this " + s.getName() + " is " + s.area(dim));
            totalArea += s.area(dim);
        }
        return totalArea;
    }
}
