/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass;

import java.util.ArrayList;

/**
 *
 * @author EddyJ
 */
public class inclass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("Savannah");
        list.add(0, "Atlanta");//Insterted to the top
        list.add(1, "temp");//replaces Savannah
        System.out.println(list.toString());
    }
}
