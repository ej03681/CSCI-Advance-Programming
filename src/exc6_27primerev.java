/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
import java.util.Scanner;

public class exc6_27primerev {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int EMIRPS = 100;
        int numprint = 0;
        int numran = 2;
        while (numprint < EMIRPS) {
            if (isPrime(numran) && isPrime(reverse(numran))
                    && !isPalindrome(numran)) {
                numprint++;
                System.out.print(numran + " ");
                if (numprint % 10 == 0) {
                    System.out.println();
                }
            }
            numran++;
        }
    }

    public static boolean isPrime(int number) {
        for (int div = 2; div <= number - 1; div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        } while (number != 0);

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));

    }

}
