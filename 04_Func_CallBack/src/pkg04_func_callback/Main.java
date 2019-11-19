/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_func_callback;

import java.io.PrintStream;
import pkg_04_libreria_opera_arrays.Operar_con_arrays;
import pkg_04_libreria_opera_arrays.Operar_con_arrays.FunCallBackOperarArrays;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Double[] array_A = {1., 2., 3., 4., 5.};
        Double[] array_B = {2., 3., 4., 5., 6.};
        Object[] arraySumaAB = Operar_con_arrays.operarArrays(array_B, array_B, Main::suma);

        arraysEnTabla(System.out, arraySumaAB);

        Object[] arrayDivAB = Operar_con_arrays.operarArrays(array_A, array_B, (Object x, Object y) -> {
            return (Double) x / (Double) y;
        });
        arraysEnTabla(System.out, arrayDivAB);
        Object[] arrayRestaAB = Operar_con_arrays.operarArrays(array_A, array_B, (Object x, Object y) -> {
            return (Double) x - (Double) y;
        });
        arraysEnTabla(System.out, arrayRestaAB);
    }

    public static double suma(Object x, Object y) {
        return (Double) x + (Double) y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void arraysEnTabla(PrintStream salida, Object[] array) {
        String tabla = "<table border=2><tr>\n";
        for (int index = 0; index < array.length; index++) {
            final Object element = array[index];
            tabla += "<td>&nbsp; " + element + " &nbsp;</td>\n";
        }
        salida.print(tabla + "</tr></table");
    }

//    public static Punto() {
//        Object[] resutlentArray = new Object[ + arr2Length];
//        for (int i = 0, j = 0; i < resutlentArray.length; i++) {
//            if (i + 1 <= arr1Length) {
//                resutlentArray[i] = objArr1[i];
//            } else {
//                resutlentArray[i] = objArr2[j];
//                j++;
//            }
//        }
//
//        return resutlentArray;
//
//    }
}
