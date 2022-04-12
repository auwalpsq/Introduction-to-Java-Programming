

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
public class MonetaryUnits2_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an amount as an integer e.g 1156: ");
        int totalAmount = input.nextInt();
        
        int amount = totalAmount;
        
        int numberOfOneDollars = amount / 100;
        amount %= 100;
        
        int numberOfQuarters = amount / 25;
        amount %= 25;
        
        int numberOfDimes = amount / 10;
        amount %= 10;
        
        int numberOfNickles = amount / 5;
        amount %= 5;
        
        int numberOfPennies = amount;
        
        System.out.println("Your amount " + totalAmount + " consist of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickles + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
