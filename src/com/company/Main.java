package com.company;

import powtorkaFig.Figure;
import powtorkaFig.Rectangle;
import powtorkaFig.Triangle;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,6);
        Triangle t1 = new Triangle(4,6);
        Figure r2 = new Rectangle(1,2);
        Figure t2 = new Triangle(5,4);

        System.out.println(r1.getArea());
        System.out.println(t1.getArea());
        System.out.println(r2.getArea());
        System.out.println(t2.getArea());
    }
}
