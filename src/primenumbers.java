/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class primenumbers {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean prime = true;
            for (int div = 2; div <= number - 1; div++) {
                if (number % div == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
            if (count % 10 == 0) {
                System.out.println(" ");
            }

        }

    }

}
