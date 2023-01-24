
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class exc17_3binarysum {
  public static void main(String[] args) throws IOException {
    try (
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));
    ) {
      for (int i = 0; i < 10; i++)
        output.writeInt((int)(Math.random() * 1));
    }

    try (
            DataInputStream input = 
                    new DataInputStream(new FileInputStream("Exercise17_02.dat"));
            ){
        int sum = 0;
        int count = input.available()/4;
        while (count > 0) {
                sum += input.readInt();
                count--;
            }
        System.out.println("The sum is "+ sum);
    } catch (Exception ex){
        ex.printStackTrace();
    }
  }
}

