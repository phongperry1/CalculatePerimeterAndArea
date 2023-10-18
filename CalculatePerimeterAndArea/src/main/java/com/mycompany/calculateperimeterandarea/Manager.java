
package com.mycompany.calculateperimeterandarea;

import java.util.Scanner;


public class Manager {
    public double checkInputDouble() {
         Scanner sc = new Scanner(System.in);
         while(true) {
             try {
                 double result = Double.parseDouble(sc.nextLine());
                 return result;
             } catch (NumberFormatException e) {
                 System.err.println("Re-input");
             }
         }
     }
     
     
     public Triangle inputTriangle() {
         while(true) {
             System.out.println("Please input side A of Triangle: ");
             double a = checkInputDouble();
             System.out.println("Please input side B of Triangle: ");
             double b = checkInputDouble();
             System.out.println("Please input side C of Triangle: ");
             double c = checkInputDouble();
             if(a + b > c && b + c > a && a + c > b) {
                 return new Triangle(a, b, c);
             } else {
                 System.out.println("Re-input");
             }
         }
     }
     
     public Rectangle inputRetangle() {
         System.out.print("Please input slide width of Rectangle: ");
         double width = checkInputDouble();
         System.out.print("Please input length of Rectangle: ");
         double length = checkInputDouble();
         return new Rectangle(width, length);
     }
     
     public Circle inputCircle() {
         System.out.print("Please input radius of Circle: ");
         double radius = checkInputDouble();
         return new Circle(radius);
     }
     
     public void display(Triangle tri, Rectangle rec, Circle cir) {
         rec.printResult();
         cir.printResult();
         tri.printResult();
         
     }
}
