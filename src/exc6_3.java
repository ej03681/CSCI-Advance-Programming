
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class exc6_3 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        
        

        if (isPalindrome(number)) {
            System.out.print(reverse(number) + " is a palindrome");
        } else {
            System.out.print(reverse(number) + " is not palindrome");
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = number % 10;
            number = number / 10;

        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        
        return (number == reverse(number));

    }

}
