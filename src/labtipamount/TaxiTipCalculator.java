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
public class TaxiTipCalculator implements TipCalculatorStrategy {

    private TipInputStrategy inputType;
    private double minimumTipBaseLine;
    private double minimumTip;
            
    public void setTipInputType(TipInputStrategy inputType) {
        this.inputType = inputType;
    }

    public double calculateTip() {
        return getCabFare() + getLuggageCost();
    }

    public void outputTipAmount(double tipAmount) {
        System.out.println("The tip is: $" + tipAmount);
    }

    private double getCabFare() {
        double cabFare = inputType.takeInputRetDouble("Enter Cab Fare: $");
        return (cabFare < .25) ? .15 : cabFare * .15;
    }

    private int getLuggageCost() {

        int numberOfBags = inputType.takeInputRetInt("Enter the number of bags the driver helped with: $");
        return (numberOfBags < 5) ? numberOfBags : numberOfBags * 2;
    }
}
