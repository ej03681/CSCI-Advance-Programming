
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
public class Date9_3 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        long time = 10000;
        for (int i = 0; i < 8; i++, time *=10){
            date = new Date(time);
            System.out.println(date.toString());
        }
    }
}
