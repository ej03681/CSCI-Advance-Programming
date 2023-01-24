
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
public class loopdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        
        double r = 0;
        for (int i = 1; i <= n; i++){
        r = Math.sqrt(1+r);
        }
        System.out.print(r);
        
    }
}
