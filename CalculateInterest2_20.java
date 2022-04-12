

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
public class CalculateInterest2_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter balance and interest rate (e.g 3 for 3%): ");
        double balance = input.nextDouble();
        double annualRate = input.nextDouble();
        
        double monthlyRate = annualRate / 1200;
        
        double interest = balance * monthlyRate;
        
        System.out.println("The interest is " + interest);
    }
}
