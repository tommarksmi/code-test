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
public class RectangleTest {
    
//    public RectangleTest() {
//    }

    Rectangle rectangle = new Rectangle(5,4);
    
    @Test
    public void testGetArea() {
        double area = rectangle.getArea();
        assertEquals(20.0,20.0,0.0);
        
    }
    
    @Test
    public void testGetPerimeter(){
        double perimeter = rectangle.getPerimeter();
        assertEquals(18, 18, 0);
    }
    
}
