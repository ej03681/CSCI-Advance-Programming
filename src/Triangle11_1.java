/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author EddyJ
 */
public class Triangle11_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        
        Triangle triangle = new Triangle(side1, side2, side3);
        
        System.out.print("Enter the color: ");
        String color = in.next();
        triangle.setColor(color);
        
        System.out.print("Enter a boolean value for filled: ");
        boolean filled = in.nextBoolean();
        triangle.setFilled(filled);
        
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is "+ triangle.getPerimeter());
        System.out.println(triangle);
    }
} 
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle (){
        
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }
    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public double getSP(){
        return getPerimeter() / 2.0;
    }
    public double getArea(){
        return Math.sqrt(getSP() * (getSP() - side1) * (getSP() - side2) * (getSP() - side3));
    }
    
}

class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
  /** Return a string representation of this object */
  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + 
      " and filled: " + filled;
  }
}
    