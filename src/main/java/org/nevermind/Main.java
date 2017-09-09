package org.nevermind;


import entity.Circle;
import entity.Rectangle;
import entity.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        double sRectangle = 0;
        double sTriangle = 0;
        double sCircle = 0;
        double globalSum = 0;

        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        Triangle triangle = (Triangle) context.getBean("triangle");
        Circle circle = (Circle) context.getBean("circle");

        ArrayList<Geometric> figuresList = new ArrayList<>();
        figuresList.add(rectangle);
        figuresList.add(triangle);
        figuresList.add(circle);

        for (int i = 0; i < figuresList.size(); i++) {
            Geometric geometric = figuresList.get(i);
            if (geometric.equals(rectangle)) {
                sRectangle = rectangle.calculateSquare();
            } else if (geometric.equals(triangle)) {
                sTriangle = triangle.calculateSquare() - (sRectangle / 2);
            } else if (geometric.equals(circle)) {
                sCircle = circle.calculateSquare() - (sTriangle + sRectangle);
            }
            System.out.println("Full square of figure #" + (i + 1) + " = " + figuresList.get(i).calculateSquare());
        }

        System.out.println("************************");
        System.out.println("Square of figure #1 = " + sRectangle);
        System.out.println("Square of figure #2 = " + sTriangle);
        System.out.println("Square of figure #3 = " + sCircle);
        globalSum = sRectangle + sTriangle + sCircle;
        System.out.println("Global square of all figures = " + globalSum);


        context.registerShutdownHook();

    }
}
