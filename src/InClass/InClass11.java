/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass;

/**
 *
 * @author EddyJ
 */
public class InClass11 {
    //public class DynamicBindingDemo {
  public static void main(String[] args) {
    Object p = new GraduateStudent();
    GraduateStudent s = (GraduateStudent)p;
    m(new GraduateStudent());
    m(new Student());
    m(new Person());
    m(new Object());
    
  }

  public static void m(Object x) {
    System.out.println(x.toString());
    
  }
}
class GraduateStudent extends Student {
}

class Student extends Person {
  @Override 
  public String toString() {
    return "Student";
  }
}

class Person extends Object {
  @Override 
  public String toString() {
    return "Person";
  }
}
