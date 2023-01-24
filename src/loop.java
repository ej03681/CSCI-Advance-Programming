
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
public class loop {
    public static void main(String[] args){
        
            System.out.println("Enter #");
            Scanner s = new Scanner (System.in);
            int n = s.nextInt();
            
            
            int sum = 0;
            int i =1;
            while (i<=n){
            sum = sum + i;
            i++;
            }
            
            System.out.println(sum);
    }
}
