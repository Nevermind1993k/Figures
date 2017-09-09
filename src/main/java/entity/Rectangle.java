package entity;

import org.nevermind.Geometric;

public class Rectangle implements Geometric {

    private double length, width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateSquare() {
        return length * width;
    }

    public void init() {
        System.out.println("I'm a object #1 (Rectangle)");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
