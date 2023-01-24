
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
public class intoccur7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] count = new int[101];
        int[] mylist = new int[count.length];
        int num;

        System.out.println("Enter the integers between 1 and 100:");
        for (int i = 0; i < count.length; i++) {
            count[i] = input.nextInt();
            if (count[i] == 0) {
                break;

            }
        }
        for (int i = 0; i < count.length; i++) {
            num = count[i];
            mylist[num]++;
        }
        for (int j = 1; j < mylist.length; j++) {
            if ((mylist[j] > 0) && (mylist[j] == 1) && (j > 0)) {
                System.out.printf("%d occurs %d time\n", j, mylist[j]);
            } else if (mylist[j] >= 2) {
                System.out.printf("%d occurs %d times\n", j, mylist[j]);
            }
        }
    }
}
