/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtipamount;

/**
 *
 * @author Alex
 */
public class TipOutputConsole implements TipOutputStrategy {
    
    @Override
    public void outputTip(double tipAmount, String outputMessage) {
        System.out.println(outputMessage + ": $" + tipAmount);
    }

}
