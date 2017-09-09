package entity;

import org.nevermind.Geometric;

public class Triangle implements Geometric {

    private Rectangle rectangle;
    private double a, b, c;
    private double p;

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

    public double calculateSquare() {
        double s;
        p = (a + b + c) / 2;
        s = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
        return s;
    }

    private void init() {
        System.out.println("I'm a object #2 (Triangle)");
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
