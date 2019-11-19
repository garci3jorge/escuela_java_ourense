/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_04_libreria_opera_arrays;

/**
 *
 * @author PC
 */
public class Operar_con_arrays {
    @FunctionalInterface
    public interface FunCallBackOperarArrays{
        Object operar(Object x,Object y);
    }

    public static Object[] operarArrays(Object[] arrX,Object[] arrY, Operar_con_arrays.FunCallBackOperarArrays operaCllbk ) {
        
        Object[] arrayResult = null;
        if (arrX.length == arrY.length) {
            arrayResult = new Object[arrX.length];
            for (int i = 0; i < arrX.length; i++) {
                arrayResult[i] = operaCllbk.operar(arrX[i], arrY[i]);
            }
        }

        return arrayResult;
    }
}
