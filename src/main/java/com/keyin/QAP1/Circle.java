package com.keyin.QAP1;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public short setRadius(double newRadius) {
        radius = newRadius;
        return 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle [radius = " + radius + " and color = " + color + "]";
    }
}
