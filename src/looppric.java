
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
public class looppric {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        
        int am = (int) (Math.random() * 100);
        while (am <= num){
            System.out.println(am);
            num++;
        }
            
        
   
    }
    
}
