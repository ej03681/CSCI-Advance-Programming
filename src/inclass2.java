
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
public class inclass2 {
    public static void main(String[] args){
    	
    	Scanner in = new Scanner(System.in);
        System.out.println("Enter dec :");
    	int dec = in.nextInt();
        
        int dev = dec / 10;
        int val = dec % 10;
        
        System.out.print(dev + ", " + val);
         
    	}
    }