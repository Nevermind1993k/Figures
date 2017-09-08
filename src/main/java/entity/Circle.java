package entity;

import org.nevermind.Geometric;

public class Circle implements Geometric {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void init() {
        System.out.println("I'm a object #3 (Circle)");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
