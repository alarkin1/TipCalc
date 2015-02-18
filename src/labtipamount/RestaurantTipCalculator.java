/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtipamount;

/**
 *
 * @author alarkin1
 */
public class RestaurantTipCalculator implements TipCalculatorStrategy {

    private TipInputStrategy inputType;

    public void setTipInputType(TipInputStrategy inputType) {
        this.inputType = inputType;
    }

    public double calculateTip() {
        return getBillForMeal() * (getPercentage() / 100);
    }

    private double getBillForMeal() {
        System.out.print("Enter The Cost Of The Meal: $");
        //validation required
        return 10;
    }

    private float getPercentage() {
        System.out.print("Enter the percentage that you would like to tip the server example(10,20,30):  ");
        //validation required
        return 1;
    }

    public void outputTipAmount(double tipAmount) {
        System.out.println("Tip the server: $" + (Math.round(tipAmount * 100) / 100));
        //Needs abstraction to output tip in different ways
    }
}
