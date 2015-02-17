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

    // TipCalculatorStrategy restaurantTip = new RestaurantTipCalculatorService();

    public void processTip(TipCalculatorStrategy tipType) {;
        tipType.outputTipAmount(tipType.calculateTip());
    }
}
