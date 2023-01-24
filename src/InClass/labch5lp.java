/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass;

import java.util.Scanner;

/**
 *
 * @author EddyJ
 */
public class labch5lp {
    public static void main(String[] args){
        int data;
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("Enter integers ending with 0: ");
        data = in.nextInt();
        sum += data;
        }while (data != 0);
        
        System.out.println(sum);
    }
}
