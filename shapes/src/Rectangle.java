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
public class Rectangle implements Shape{

    private final int width;
    private final int length;
    
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    
    
    
    @Override
    public double getArea() {
        return (this.width * this.length);
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }
    
}
