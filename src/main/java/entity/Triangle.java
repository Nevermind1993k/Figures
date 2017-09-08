package entity;

import org.nevermind.Geometric;

public class Triangle implements Geometric {

    Rectangle rectangle;
    double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Rectangle rectangle, double a, double b, double c) {
        this.rectangle = rectangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        //TODO
        return a;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
