
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
public class vowels {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        int s = in.nextInt();
        
        char ch = ((char)s);
        
    
    switch (ch) {
            case 65: System.out.println(s+" is a vowel");
            case 69: System.out.println(s+" is a vowel");
            case 73: System.out.println(s+" is a vowel");
            case 79: System.out.println(s+" is a vowel");
            case 85: System.out.println(s+" is a vowel");
            case 97: System.out.println(s+" is a vowel");
            case 101: System.out.println(s+" is a vowel");
            case 105: System.out.println(s+" is a vowel");
            case 111: System.out.println(s+" is a vowel");
            case 117: System.out.println(s+" is a vowel");
            default : System.out.println(s+" is a constant");
            break;
      }
    }
}
