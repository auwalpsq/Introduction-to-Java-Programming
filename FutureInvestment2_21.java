

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
public class FutureInvestment2_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 1200;
        
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        
        double futureInvestmentAmount = investmentAmount * Math.pow(1 + monthlyRate, years * 12);
        
        System.out.println("Accumulated value is $" + futureInvestmentAmount);
    }
}
