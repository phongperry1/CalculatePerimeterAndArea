
package com.mycompany.calculateperimeterandarea;




public class Main {
     
    public static void main(String[] args) {
        Manager mn = new Manager();
        Rectangle rectangle = mn.inputRetangle();
        Circle circle = mn.inputCircle();
        Triangle triangle = mn.inputTriangle();
        mn.display(triangle, rectangle, circle);
    }
}
