
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class longMaxVal10_17 {
    public static void main(String[] args) {

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println( n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
    }

}
