/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;
import java.util.*;


public class Rectangle {
    private float length = 1.0F;
    private float width = 1.0F;
    Scanner len = new Scanner (System.in);
    Scanner wid = new Scanner (System.in);
            
    Rectangle() {
        
    }
    Rectangle(float l, float w) {
        length = l;
        width = w;
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
        return String.format("Rectangle[length=%f, width=%f]", length, width);
    }
}
