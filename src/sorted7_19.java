/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
import java.util.Arrays;
import java.util.Scanner;
public class sorted7_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the list size of the list: ");
        int n = input.nextInt();
        
        int[] list = new int[n];
        
        System.out.print("Enter the contents of the list: ");
        for(int i = 0; i < n; i++)
        list[i] = input.nextInt();
        
        System.out.println("The list has "+n+" integers"+ Arrays.toString(list));
        if (isSorted(list))
                System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");
        
    }
    public static boolean isSorted(int[] list){
        for(int i = 0, j = 0; i < list.length; i++){
            j++;
            if(list[i] != j)
                return false;
        }
        return true;
    }
}
