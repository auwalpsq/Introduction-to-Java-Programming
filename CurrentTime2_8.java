

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_2;
import java.util.Scanner;
/**
 *
 * @author Auwal Usman
 */
public class CurrentTime2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();
        
        long milliseconds = System.currentTimeMillis();
        
        long totalSeconds = milliseconds / 1000;
        
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        
        long currentHour = totalHours % 24;
        
        System.out.println("The current time is " + (currentHour + timeZone) + ":" + currentMinute + ":" + currentSecond);
    }
}
