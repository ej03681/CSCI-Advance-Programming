
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
public class loopinclass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 2; j--){
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i; j++){
              System.out.print(j+" ");
              
            }
            System.out.println();
        }
    }
}
