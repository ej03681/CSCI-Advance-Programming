
import java.util.ArrayList;
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
public class ArrayList11_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++) list.add(in.nextInt());
        
        sort(list);
        list.toString();
        System.out.print(list.get(0)+" "+ list.get(1)+" "+list.get(2)+" "+list.get(3)+" "+list.get(4));
        System.out.println();
    }
    public static void sort(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int n = list.get(i);
            int current = i;
            
            for(int j = i + 1; j < list.size(); j++){
                if (n > list.get(j)){
                    n = list.get(j);
                    current = j;
                }
            }
            if (current != i){
                list.set(current, list.get(i));
                list.set(i, n);
            }
        }
    }
}
