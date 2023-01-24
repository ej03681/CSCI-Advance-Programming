
import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class Divisibleby10_16 {

    public static void main(String[] args) {

        String dig = "" + 1;
        for (int i = 0; i < 49; i++) {
            dig += "0";
        }
        BigDecimal diggits = new BigDecimal(dig);
        int times = 0;
        while (times < 10) {
            BigDecimal a = diggits.remainder(new BigDecimal(2));
            BigDecimal b = diggits.remainder(new BigDecimal(3));
            if (a.equals(BigDecimal.ZERO) || b.equals(BigDecimal.ZERO)) {
                times++;
                System.out.println(diggits);
            }
            diggits = diggits.add(BigDecimal.valueOf(2));
        }
    }
}