
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
public class exc8_1summatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double [3][4];
        
        System.out.println("Enter a 3 by 4 matrix row by row");
        
        for(int row =0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix [row][column] = input.nextDouble();
            }
        }
        for(int column = 0; column < matrix[0].length; column++){
            double total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum of the elements at column "+ column +" is "+ total);
        }
    }
}
