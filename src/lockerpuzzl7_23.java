

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class lockerpuzzl7_23 {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[101];
        
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; i * j <= 100; j++) {
                lockers[i * j] = !lockers[i * j];
            }
        }
        System.out.println("Open lockers: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print( i+" ");
            }
        }
        System.out.println();
    }

}
