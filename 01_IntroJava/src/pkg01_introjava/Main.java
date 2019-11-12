/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.TransformException;
import pkg02_intro_java_poo.vehiculos.Coche;
import pkg02_intro_java_poo.vehiculos.FabricaCoches;
import pkg05_intro_java_excepciones.UsoNormalExcepciones;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
                    
            
        
        try {
            System.out.println("Hola chavules");
            //codigo con errores
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            //unObj.metodoPeligroso();
            //mas codigo con erroresç
            //Object objnull = null;
            //System.out.println("Fallara " + objnull.toString());
            
            throw  new TransformException("nueva excepcion");

        } catch (RuntimeException ex) {
            System.out.println("Cualquier tipo de RuntimeException: ");
            Logger.getLogger("<< LOG >>  :  " + Main.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            //captura cualquier Excepcion, cuyo tipo sea el indicado en el 
            //catch o cualquiera de sus clases hijas
            System.out.println("Cualquier tipo de Excepcion: ");
            Logger.getLogger("<< LOG >>  :  " + Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void mainConTryCatchPorSeparado(String[] args) {
        //distintas llamadas a los metodos
        //mostrarTiposDatos();
        //condiciones();
        //ordenarArray();
        System.out.println("hola a todos");
        try {
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion " + ex.getMessage());

            System.out.println("\nPila de llamadas "
                    + Arrays.toString(ex.getStackTrace()));
        }
        try {

        } catch (Exception e) {
        }

    }

    public static void mostrarTiposDatos() {
        System.out.println("hola mundo de aqui");
        String algo = "algo";
        System.out.println(algo);
        //array
        char arrayChar[] = {'a', 'b', 'c'};

        //bucle
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index= " + index + ", char " + arrayChar[index]);
            index++;
        }

//        for (int i = 0; i < 10; i++) {
//
//        }
//
//        do {
//
//        } while (true);
        for (char caracter : arrayChar) {
            System.out.println("char " + caracter);
        }
    }

    public static void condiciones() {
        //if sin else
        if ("palabra".length() > 5) {
            System.out.println("palabra larga");
        }
        // if con else
        if ("texto".length() > 5) {

        } else {
            System.out.println("palabra corta");
        }
        // if con else if anidados

        //switch
        int numero;
        switch (numero = 2) {
            case 0:
                System.out.println("vale 0");
                break;
            case 1:
                System.out.println("vale 1");
                break;
            case 2:
                System.out.println("vale 2");

            case 3:
                System.out.println("vale 3");
                break;
            default:
                System.out.println("vale 35");
                break;
        }

    }

    public static void probarOperadores() {
        //negacion(!), incremento (++), decremento(--),
        //suma (+), resta (-), multiplicacion (*),division (/),
        //and (&&), or (||), igualdad (==), distinto (!=)
        //Operadores bit a bit
        //AND (&)
        //OR (|)
        //XOR (^)
    }

    /**
     * Esto es un ejecicio de ordenar un array
     */
    public static int[] ordenarArray(int[] arrayNumerico) {
        //declarar array enteros
        //Programar todo lo que haga falta para ordenarlo

        //para poder hacer prubeas necesitas comentar este array y el return de abajo
        //int[] arrayNumerico = {4, 2, 6, 1, 3, 5, 3};
        int comodin;
        System.out.println("Descendente");
        for (int i = 0; i < arrayNumerico.length; i++) {

            for (int j = 1; j < arrayNumerico.length; j++) {
                if (arrayNumerico[j] > arrayNumerico[j - 1]) {
                    comodin = arrayNumerico[j - 1];
                    arrayNumerico[j - 1] = arrayNumerico[j];
                    arrayNumerico[j] = comodin;

                }

            }
        }

        for (int j = 0; j < arrayNumerico.length; j++) {
            System.out.println(arrayNumerico[j]);
        }

//        System.out.println("Ascendente");
//        int[] arrayDesordenado = {4, 2, 6, 1, 3, 5, 3};
//        for (int i = 0; i < arrayDesordenado.length; i++) {
//
//            for (int j = 1; j < arrayDesordenado.length; j++) {
//                if (arrayDesordenado[j - 1] > arrayDesordenado[j]) {
//                    comodin = arrayDesordenado[j];
//                    arrayDesordenado[j] = arrayDesordenado[j - 1];
//                    arrayDesordenado[j - 1] = comodin;
//
//                }
//
//            }
//        }
//
//        for (int j = 0; j < arrayDesordenado.length; j++) {
//            System.out.println(arrayDesordenado[j]);
//        }
        return arrayNumerico;

    }

}
