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
public interface TipOutputStrategy {
        public abstract void outputTip(double dataToOutput, String outputMessage);
}
