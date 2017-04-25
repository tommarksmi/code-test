/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author tom
 */
public class Circle implements Shape{
    final private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) (radius * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI * radius);
    }
}
