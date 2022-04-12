

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
public class CostOfDriving2_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        double cost = distance / milesPerGallon * pricePerGallon;
        
        System.out.println("The cost of driving is $" + (int)(cost * 100) / 100.0);
    }
}
