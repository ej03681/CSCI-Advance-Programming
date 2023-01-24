
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
public class VowandCon4_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a letter: ");
        String s = in.nextLine();
        char ch = s.charAt(0);
        
        if ((s.length() != 1) || ((Character.isDigit(ch)))) {
      System.out.println("invalid input");
      System.exit(0);
    }
        
        if ((ch == 65) || (ch == 69) || (ch == 73) || (ch == 79) || (ch == 85) || (ch == 89) || (ch == 97) || (ch == 101) || (ch == 105) || (ch == 111) || (ch == 117)) 
            System.out.println(s+" is a vowel");
         else if ((ch < 65) || (ch > 122)) 
            System.out.println("invalid input");
         else 
                System.out.println(s+" is a consonant");
          
                          
        
    }
}
   
