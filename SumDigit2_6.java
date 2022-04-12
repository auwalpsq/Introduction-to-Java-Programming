

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
public class SumDigit2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        int digit1 = number % 10;
        number /= 10;
        
        int digit2 = number % 10;
        number /= 10;
        
        int digit3 = number % 10;
        
        int sum = digit1 + digit2 + digit3;
        
        System.out.println("The sum of the digits is " + sum);
    }
}
