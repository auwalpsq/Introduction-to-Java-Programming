

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
public class ComputingBMI2_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();
        
        final double POUND_PER_KILOGRAM = 0.45359237;
        final double INCH_PER_HEIGHT = 0.0254;
        
        double weightInKilograms = weight * POUND_PER_KILOGRAM;
        double heightInMeters = height * INCH_PER_HEIGHT;
        
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        System.out.println("BMI is " + ((int)(bmi * 10000) / 10000.0));
    }
}
