

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
public class NumberOfYears2_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enetr the number of minutes: ");
        int minutes = input.nextInt();
        
        int totalDays = minutes / (60 * 24);
        
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
