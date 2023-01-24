/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass;

import java.util.Scanner;

/**
 *
 * @author EddyJ
 */
public class exc5_1 {
     public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer, the input ends if it is 0:");
  int n, countNeg = 0, countPos = 0;
  float sum = 0;
 
  while ((n = input.nextInt()) != 0) {
   sum = sum + n;
 
   if (n > 0) {
    countPos++;
   } else if (n < 0) {
    countNeg++;
   }
 
  }
 
  if (countPos + countNeg == 0) {
   System.out.println("No numbers are entered except 0");
   System.exit(0);
  }
 
  System.out.println("The number of positives is " + countPos);
  System.out.println("The number of negatives is " + countNeg);
  System.out.println("The total is " + sum);
  System.out.println("The average is " + (sum / (countPos + countNeg)));
 
 }
 
}

