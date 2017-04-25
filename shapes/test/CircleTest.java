/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tom
 */
public class CircleTest {
    
    Circle circle = new Circle(3);
    
    @Test
    public void testGetArea(){
        double area;
        assertEquals(9.4,9.4,0.1);
    }
    
    @Test
    public void testGetPerimeter(){
        double perimeter;
        assertEquals(18.8,18.8,0.1);
    }
}
