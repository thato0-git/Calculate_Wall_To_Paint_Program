/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author thato
 */
public class CalculateWallToPaint {

    /**
     * @param args the command line arguments
     */
    public static double calcArea(double length, double height) {
        return length * height;

    }

    public static double calcLitresPaint(double area, double coveragePerLiter) {
        return area / coveragePerLiter;

    }

    public static int calcTins(double litresNeeded, int tinSize) {
        return (int) Math.ceil(litresNeeded / tinSize);
    }

    public static void main(String[] args) {
        double length, height, coveragePerLiter, area, litresNeeded;
        int tinSize = 5; //Standard 5-liter tins
        int tinsNeeded;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of wall(meters):");
        length = input.nextDouble();

        System.out.print("Enter hieght of wall(meters):");
        height = input.nextDouble();

        System.out.print("Enter coverage per liter(square meters):");
        coveragePerLiter = input.nextDouble();

        area = calcArea(length, height);
        litresNeeded = calcLitresPaint(area, coveragePerLiter);
        tinsNeeded = calcTins(litresNeeded, tinSize);

        System.out.println("Calculation results: ");
        System.out.println("Wall area: " + area + " square meters");
        System.out.println("Paint needed: " + litresNeeded + " litres");
        System.out.println("Number of 5-liter tins required: " + tinsNeeded);

    }
}
