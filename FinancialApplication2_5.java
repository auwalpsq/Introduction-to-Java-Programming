

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
public class FinancialApplication2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal = input.nextInt();
        double gratuityRate = input.nextDouble();
        
        double gratuity = gratuityRate / 100 * subtotal;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (subtotal + gratuity));
    }
}
