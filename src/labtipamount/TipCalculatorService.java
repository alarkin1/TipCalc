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
public class TipCalculatorService {

    public void processTip(TipCalculatorStrategy tipType, TipOutputStrategy outputType, TipInputStrategy inputType) {
        tipType.setTipInputType(inputType);
        tipType.setTipOutputType(outputType);
        tipType.forwardTipAmount(tipType.calculateTip());
    }

}
