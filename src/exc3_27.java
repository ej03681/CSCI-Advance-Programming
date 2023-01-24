
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class exc3_27 {
    public static void main(String[] args){
        
        System.out.println("Enter a point's x- and y-coordinates: ");
        Scanner in = new Scanner(System.in);
        
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        double a = 100.0/((y/x)+(1.0/2));
        double b = (-0.5 * a) + 100;
        
      
        if (( x >= a) || (y >= b)) 
                System.out.println("The point is not in the triangle");
            else 
                        System.out.println("The point is in the triangle");
            
            }
    }
    

