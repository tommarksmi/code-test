/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tom
 */
public class Triangle implements Shape{
    final private int sideA;
    final private int sideB;
    final private int sideC;
    final private int height;
    
    public Triangle(int sideA, int sideB, int sideC, int height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double getArea() {
        //Making the assumption that sideA is always the base of the triangle.
        return (double) (0.5 * (sideA * height));
    }

    @Override
    public double getPerimeter() {
        return (double) (sideA + sideB + sideC);
    }
    
}
