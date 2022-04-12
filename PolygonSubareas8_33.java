

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_2;

import java.util.Scanner;
import static chapter_8.AreaOfATriangle8_32.distance;
import java.util.Arrays;
/**
 *
 * @author Auwal Usman
 */
public class PolygonSubareas8_33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        
        displayAreas(points);
    }
    public static void displayAreas(double[][] points){
        double[] areas = getSubareas(points);
        for(int i = 0; i < areas.length; i++){
            System.out.print(areas[i] + " ");
        }
    }
    public static double[] getSubareas(double[][] points){
        double side1 = distance(points[0], points[1]);
        double side2 = distance(points[1], points[2]);
        double side3 = distance(points[2], points[3]);
        double side4 = distance(points[1], points[3]);
        double[] intersection = chapter_8.IntersectingPoint8_31.getIntersectingPoint(points);
        double side11 = distance(points[0], intersection);
        double side22 = distance(points[1], intersection);
        double side33 = distance(points[2], intersection);
        double side44 = distance(points[3], intersection);
        double[] areas = new double[4];
        
        areas[0] = getArea(side1, side11, side22);
        areas[1] = getArea(side2, side22, side33);
        areas[2] = getArea(side3, side33, side44);
        areas[3] = getArea(side4, side44, side11);
        
        Arrays.sort(areas);
        return areas;
    }
    public static double getArea(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
