/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.geometry.Point2D;
/**
 *
 * @author EddyJ
 */
public class MyPoint10_4 {
    public static void main(String[] args){
        Point2D b1 = new Point2D(0,0);
        Point2D b2 = new Point2D(10, 30.5);
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint.distance(p1,p2));
        System.out.println(b1.distance(b2));
    }
}
class MyPoint{
    private double x;
    private double y;
    
    public MyPoint(){
        
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(MyPoint secondPoint){
        return Math.sqrt((x - secondPoint.getX() * (x - secondPoint.x) + (y - secondPoint.y) * (y - secondPoint.y)));
    }
    public double distance(double x, double y){
        return this.distance(new MyPoint(x, y));
    }
    public static double distance(MyPoint p1, MyPoint p2){
        return p1.distance(p2);
    }
}