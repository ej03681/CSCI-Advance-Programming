
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class ex17_5 {
    public static void main(String[] args) throws IOException{
        int[] numbers = {1,2,3,4,5};
        try 
            (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))){
            out.writeObject(numbers);
            out.writeObject(new Date());
            out.writeDouble(5.5);
         
            out.close();
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Exercise17_5.dat"));
            
        
            for(int i = 0; i < 10; i++){
                System.out.print((int) ois.readByte());
            }
        }catch (Exception ex){
        ex.printStackTrace();
        }
    }
}
