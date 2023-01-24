
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
public class ch4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter a letter: ");
        String s = in.nextLine();
        char ch = s.charAt(0);
        
        int x = Integer.parseInt(s);
        System.out.println(x);
    }
}
