
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
public class isbn13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first 12 digits of an ISBN-13 as a string: ");
        
        String s = in.nextLine();
        int sum = 0;
        
        if (s.length() != 9) {
            System.out.println(s + " is an invalid input");
            System.exit(0);
        }
       for (int i = 0; i < s.length(); i++){
           if ((i + 1) % 2 == 0){
               sum += s.charAt(i) - 48;
           } else {
               sum += 2 * (s.charAt(i) - 48);
           }
       }
        sum = (10 - sum%10)%10;
        System.out.println("the ISBN-13 number is "+s+sum);
        
    }
}
