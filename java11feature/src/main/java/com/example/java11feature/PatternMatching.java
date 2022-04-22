package com.example.java11feature;

public class PatternMatching {

    static double getPerimeter(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return 2 * r.length() + 2 * r.width();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }
}

interface Shape {}

class Rectangle implements Shape {
    final double length;
    final double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double length() { return length; }
    double width() { return width; }
}

class Circle implements Shape {
    final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double radius() { return radius; }
}
