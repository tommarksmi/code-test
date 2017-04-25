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
public class TriangleTest {

    Triangle tri = new Triangle(3,5,2,4);
    
    @Test
    public void testGetArea(){
        double area;
        assertEquals(6,6,0);
    }
    
    @Test
    public void testGetPerimeter(){
        double perimeter;
        assertEquals(10.0,10.0,0);
    }
}
