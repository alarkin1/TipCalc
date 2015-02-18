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
public interface TipCalculatorStrategy {
   public abstract double calculateTip();
   public abstract void outputTipAmount(double tipAmount);
   public abstract void setTipInputType(TipInputStrategy inputType);
}
