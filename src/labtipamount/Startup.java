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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipCalculatorService tipCalculatorMaster = new TipCalculatorService();
        tipCalculatorMaster.processTip(new TaxiTipCalculator(), new TipOutputConsole(), new TipInputConsole());
    }
    
}
