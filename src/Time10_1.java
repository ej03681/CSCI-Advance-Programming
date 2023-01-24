
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
public class Time10_1 {
    public static void main(String[] args){
        Time time = new Time(555550000);
        System.out.println("Hour: " + time.getHour() + " Minutes: "+ time.getMinute()+ 
                " Second: "+ time.getSecond());
    }
}
class Time {
    public int time;
    
    public Time(){
        
    }
    Time(int newTime){
        time = newTime;
    }
    public int getHour(){
        int hour;
        hour = (int)(time / (1000*60*60)) % 24;
        return hour;
    }
     public int getMinute(){
        int mins;
        mins = (int) (time / (1000*60) % 60);
        return mins;
   }
    public int getSecond(){
        int secs;
        secs = (int) (time / 1000) % 60;
        return secs;
    }
    void set(int newTime){
        time = newTime;
    }
}
