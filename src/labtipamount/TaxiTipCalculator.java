/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtipamount;

import java.util.Scanner;

/**
 *
 * @author alarkin1
 */
public class TaxiTipCalculator implements TipCalculatorStrategy {

    private Scanner keyboard = new Scanner(System.in);

    public double calculateTip() {
        return getCabFare() + getLuggageCost();
    }

    public void outputTipAmount(double tipAmount) {
        System.out.println("The tip is: $" + tipAmount);
    }

    private double getCabFare() {
        System.out.print("Enter total cab fare: $");
        double cabFare = keyboard.nextDouble();
        //needs validation
        return (cabFare < .25) ? .15 : cabFare * .15;
    }

    private int getLuggageCost() {
        System.out.print("Enter number of bags the driver helped with: $");
        int numberOfBags = keyboard.nextInt();
        //needs validation
        return (numberOfBags < 5) ? numberOfBags : numberOfBags * 2;
    }
}
