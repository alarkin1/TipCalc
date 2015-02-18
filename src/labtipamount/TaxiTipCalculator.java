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
    private TipOutputStrategy outputType;
    private double minimumTipBaseLine;
    private double minimumTip;

    @Override
    public void setTipInputType(TipInputStrategy inputType) {
        this.inputType = inputType;
    }

    @Override
    public void setTipOutputType(TipOutputStrategy outputType) {
        this.outputType = outputType;
    }

    @Override
    public double calculateTip() {
        return getCabFare() + getLuggageCost();
    }

    @Override
    public void forwardTipAmount(double tipAmount) {
        outputType.outputTip(calculateTip(), "The Tip is");
        //System.out.println("Tip the server: $" + (Math.round(tipAmount * 100) / 100));
        //Needs abstraction to output tip in different ways
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
