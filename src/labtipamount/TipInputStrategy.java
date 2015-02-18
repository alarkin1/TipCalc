/*
 * To change this license header, choosecx License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtipamount;

/**
 *
 * @author Alex
 */
public interface TipInputStrategy {
   public abstract double takeInputRetDouble(String inputRequest);
   public abstract int takeInputRetInt(String inputRequest);
   public abstract String takeInputRetString(String inputRequest);
}
