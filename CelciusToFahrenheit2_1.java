

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
public class CelciusToFahrenheit2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in celcius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0 / 5) * celcius + 32;
        
        System.out.print("Celcius " + celcius +  " is " + fahrenheit + " in fahrenheit");
    }
}
