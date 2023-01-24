/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
class Test{
    

    public static void main(String[] args) {

        Rect rect1 = new Rect(4,40);
        System.out.println(rect1.getArea()+", "+ rect1.getPerimeter());
        
        Rect rect2 = new Rect(3,35);
        System.out.println(rect2.getPerimeter() +", "+ rect2.getArea()+", ");
    }
}
public class Rect {
    private double width;
    private double height;
    
    public Rect() {
        this.width  = 1;
        this.height = 1;
    }
    public Rect(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
    public void set(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }
}