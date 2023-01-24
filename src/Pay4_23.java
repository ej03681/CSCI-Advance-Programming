
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
public class Pay4_23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String n = in.nextLine();
        
        System.out.println("Enter number of hours worked in a week: ");
        double hrs = in.nextDouble();
        
        System.out.println("Enter hourly pay rate: ");
        double pay = in.nextDouble();
        
        System.out.println("Enter federal tax withholding rate: ");
        double frt = in.nextDouble();
        
        System.out.println("Enter state tax withholding rate: ");
        double srt = in.nextDouble();
        
        System.out.println("Employee name: " + n);
        System.out.println("Hours Worked: " + hrs);
        System.out.println("Pay Rate: $" + pay);
        double gross = pay*hrs;
        System.out.println("Gross Pay: $" + (pay*hrs));
        System.out.printf("Deductions:\n");
        double fw = gross - (gross - (gross * frt));
        double fp = frt * 100;
        
        System.out.printf("Federal Withholding ( %.2f ): $%.2f\n", fp, fw);
        
        double sw = gross- (gross - (gross * srt));
        double sp = srt * 100;
        
        System.out.printf("State Withholding ( %.2f ): $%.2f\n", sp, sw);
        
        double ded = (gross * frt) + (gross * srt);
        
        System.out.printf("Total Deduction: $%.2f\n", ded);
        
        double net = gross - ded;
        
        System.out.printf("Net pay: $%.2f\n", net);
    }
}
