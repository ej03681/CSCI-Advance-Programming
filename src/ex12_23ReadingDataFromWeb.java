
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
public class ex12_23ReadingDataFromWeb {
    public static void main(String[] args) throws Exception{
        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("File size: "+ count +" FIle: " + input);
        }
        catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("IO Errors");
        }
    }
}
