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
    private TipOutputStrategy outputType;

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
        return getBillForMeal() * (getPercentage() / 100);
    }

    private double getBillForMeal() {
        return inputType.takeInputRetDouble("Enter The Cost Of The Meal: $");
    }

    private double getPercentage() {
        return inputType.takeInputRetDouble("Enter the percentage that you would like to tip the server example(10,20,30): ");
    }

    @Override
    public void forwardTipAmount(double tipAmount) {
        outputType.outputTip(tipAmount, "The Tip is");
    }
}
