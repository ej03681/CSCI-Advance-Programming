
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
public class wkdays3_5 {
    public static void main(String[] args){
        System.out.println("Enter today's day: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt(' ');
        
        System.out.println("Enter the number of days elapsed since today: ");
        int later = in.nextInt();
        
        switch (day % 7) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println ("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 0: System.out.println("Sunday");
            break;
        }
        switch (later % 7){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println ("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 0: System.out.println("Sunday");
            break;
        }
         System.out.println("Today is "+ day +" and the future day is "+ later);
    }
}
