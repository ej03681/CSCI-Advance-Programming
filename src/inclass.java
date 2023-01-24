
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
public class inclass {
    public static void main(String[] args){
    	int n = 9;
    	int fibN = 0;

    	String sequence = "";
    	
    
       System.out.print(fibonacciRecursion(n));
    }
    public static int fibonacciRecursion(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion( n - 2 ) + fibonacciRecursion( n - 1 );
    }
    
}
