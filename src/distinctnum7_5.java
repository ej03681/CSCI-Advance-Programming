

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class distinctnum7_5 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];
        int number;
        int[] num = new int[11];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers.length != 10) {
                break;
            }
        }
        int[] intlist = new int[11];
        int count;

        for (int i = 0; i < numbers.length; i++) {
            count = numbers[i];
            intlist[count]++;
            
        }

        int distinct = 0;

        for (int j = 0; j < intlist.length; j++) {
            if (intlist[j] >= 1) {
                distinct++;
                
            }
        }
        System.out.println("The number of distict integers is " + distinct);
        System.out.print("The distinct integers are ");

        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            num[number]++;
           
            if (num[number] == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
