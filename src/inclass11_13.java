/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
import java.util.ArrayList;

public class inclass11_13 {

public static void main(String[] args){
    
        MyStack stack = new MyStack();
        stack.push(new Integer(2));
        stack.push(new Double(4.5));
        
}
        private ArrayList<Object> list = new ArrayList<>();
        
    
  public boolean isEmpty() {
            return list.isEmpty();
        }

        public int getSize() {
            return list.size();
        }

        public Object peek() {
            return list.get(getSize() - 1);
        }

        public Object pop() {
            Object o = list.get(getSize() - 1);
            list.remove(getSize() - 1);
            return o;
        }
    }
}
