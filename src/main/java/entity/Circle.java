package entity;

import org.nevermind.Geometric;

public class Circle implements Geometric {

    private double radius;
    private Triangle triangle;
    private Rectangle rectangle;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, Triangle triangle, Rectangle rectangle) {
        this.radius = radius;
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    public double calculateSquare() {
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
