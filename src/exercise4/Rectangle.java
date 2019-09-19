/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;
import java.util.*;


public class Rectangle {
    float length;
    float width;
    Scanner len = new Scanner (System.in);
    Scanner wid = new Scanner (System.in);
            
    Rectangle() {
        length = 1.0F;
        width = 1.0F;
    }
    
    public void Rectangle() {
        
    }
    
    public void Rectangle(float length, float width) {
        
    }
    
    public float getLength() {
        return length;
    }
    
    public void setLength(float length) {
        length = len.nextFloat();
    }
    
    public float getWidth() {
        return width;
    }
    
    public void setWidth(float width) {
        width = wid.nextFloat();
    }
    
    public double getArea() {
        return (double)length*width;
    }
    
    public double getPerimeter() {
        return (double)(2*(length+width));
    }
    
    public String toString() {
        return "Rectangle[length=?, width=?]";
    }
}
