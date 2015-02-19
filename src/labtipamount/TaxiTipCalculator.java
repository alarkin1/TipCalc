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
    private double qualityPercentage;
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
        setMinimumTip();
        setQualityPercentage();
        setMinimumTipBaseLine();
        return (inputCabFare() + inputLuggageCost());
    }

    @Override
    public void forwardTipAmount(double tipAmount) {
        outputType.outputTip(tipAmount, "The Tip is");
    }

    private void setMinimumTipBaseLine() {
        minimumTipBaseLine = inputType.takeInputRetDouble("Enter Maximum cab fare for the minimum tip: $");
        System.out.println(minimumTipBaseLine);
    }

    private void setMinimumTip() {
        minimumTip = inputType.takeInputRetDouble("Enter Minimum tip: $");
        System.out.println(minimumTip);
    }

    private void setQualityPercentage() {
        qualityPercentage = (inputType.takeInputRetDouble("Enter the percentage of the cab fare to give the driver, example(10,20,30): ") / 100);
        System.out.println(qualityPercentage);
    }

    private double inputCabFare() {
        double cabFare = inputType.takeInputRetDouble("ENTER COST OF TAXI RIDE: $");
        return (cabFare < minimumTipBaseLine) ? minimumTip : cabFare * qualityPercentage;
    }

    private int inputLuggageCost() {
        int numberOfBags = inputType.takeInputRetInt("Enter the how many pieces of luggage the driver helped with: ");
        return (numberOfBags < 5) ? numberOfBags : numberOfBags * 2;
    }
    
}