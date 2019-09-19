/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;
import java.util.*;


public class Circle {
    double radius;
    Scanner rad = new Scanner (System.in);
    
    Circle() {
        radius = 1.0;
    }
    
    public void Circle() {
        
    }
    
    public void Circle(double radius) {
        
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        radius = rad.nextDouble();
    } 
    
    public double getArea() {
        return Math.PI*(Math.pow(radius, 2));
    }
    
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    
    public String toString() {
        return "Circle[radius=?]";
    }
}
