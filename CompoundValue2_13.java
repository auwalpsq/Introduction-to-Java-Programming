

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
public class CompoundValue2_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        
        double annualRate = 5.0 / 100;
        double monthlyRate = annualRate / 12.0;
        
        double month_1 = amount * (1 + monthlyRate);
        
        double month_2 = (amount + month_1) * (1 + monthlyRate);
        
        double month_3 = (amount + month_2) * (1 + monthlyRate);
        
        double month_4 = (amount + month_3) * (1 + monthlyRate);
        
        double month_5 = (amount + month_4) * (1 + monthlyRate);
        
        double month_6 = (amount + month_5) * (1 + monthlyRate);
        
        double totalAmount = (int)(month_6 * 100) / 100.0;
        
        System.out.println("After six months, the account value is: $" + totalAmount);
    }
}
