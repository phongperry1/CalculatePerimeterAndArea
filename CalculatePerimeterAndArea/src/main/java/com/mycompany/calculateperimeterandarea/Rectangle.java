
package com.mycompany.calculateperimeterandarea;


public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width * length;
    }
    
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    
    @Override
    public void printResult() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
}

