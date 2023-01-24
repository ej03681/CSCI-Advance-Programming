
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class revints7_2 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] myList = new int [10];
        System.out.print("Read ten intgers: ");
        for (int i = 0; i < 10; i++){
            
            myList[i] = input.nextInt();
        }
        System.out.println("The reversal of the input is "
                +Arrays.toString(reverse(myList)));
        
    }
    public static int[] reverse(int[] myList){
        int[] result = new int[myList.length];
        
        for (int i = 0, j = result.length -1;
                i < myList.length; i++, j--){
            result[j] = myList[i];
        }
        return result;
    }
}
