
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
public class exc3_9 {
    public static void main(String[] args){
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        Scanner in = new Scanner(System.in);
        int isbn = in.nextInt();
        
        int d1 = (int) (isbn / 100000000);
        int d2 = (int) (isbn / 10000000)%10;
        int d3 = (int) (isbn / 1000000)%10;
        int d4 = (int) (isbn / 100000)%10;
        int d5 = (int) (isbn / 10000)%10;
        int d6 = (int) (isbn / 1000)%10;
        int d7 = (int) (isbn / 100)%10;
        int d8 = (int) (isbn / 10)%10000000%1000000%100000%100000%10000%1000%100%10;
        int d9 = (int) (isbn % 100000000)%10000000%1000000%100000%10000%1000%100%10;
        
        int chsm = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        if (chsm == 10)
            System.out.println("The ISBN-10 is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        else
        System.out.println("The ISBN-10 is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+chsm);
    }
}
