/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tom
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4,5);
        System.out.println("rect area: " + rect.getArea() + "\n" + 
                "rect perimeter: " + rect.getPerimeter());
        
        Circle circle = new Circle(3);
        System.out.println();
        System.out.println("circle area: " + circle.getArea() + "\n" + 
                "circle perimeter: " + circle.getPerimeter());
        
        
        Triangle tri = new Triangle(3,5,2,4);
        System.out.println();
        System.out.println("tri area: " + tri.getArea() + "\n" + 
                "tri perimeter: " + tri.getPerimeter());
    }

}
    
