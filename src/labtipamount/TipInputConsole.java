/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtipamount;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TipInputConsole implements TipInputStrategy {

    private Scanner keyboard = new Scanner(System.in);

    @Override
    public double takeInputRetDouble(String inputRequest) {
        System.out.print(inputRequest);
        //validation needed
        return keyboard.nextDouble();
    }

    @Override
    public int takeInputRetInt(String inputRequest) {
        System.out.print(inputRequest);
        //validation needed
        return keyboard.nextInt();
    }

    @Override
    public String takeInputRetString(String inputRequest) {
        System.out.print(inputRequest);
        //validation needed
        return keyboard.nextLine();
    }

}
