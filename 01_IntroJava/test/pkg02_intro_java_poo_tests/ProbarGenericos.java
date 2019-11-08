/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo_tests;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg02_intro_java_poo.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class ProbarGenericos {

    public ProbarGenericos() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    //Ejemplo de paso por refencia, este test y los dos metodos contiguos
    @Test
    public void testearMetodosGenericos() {
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
        insertarIntegerDosVeces(listIn, tres);
        insertarIntegerDosVeces(listIn, cinco);
        System.out.println("tres sigue siendo " + tres);
        for (Integer integer : listIn) {
            System.out.println(" - " + integer);

        }
        //en el segundo parentesis no ha falta poner el tipo de ato ya que lo
        // deduce por su declaracion
        ArrayList<String> listSrt = new ArrayList<>();
        insertarIntegerDosVeces(listSrt, "tres");
        insertarIntegerDosVeces(listSrt, "cinco");
        for (String unString : listSrt) {
            System.out.println(" - " + unString);

        }
        
        
        //estas dos pruebas son con el metodo insertarDuplicado
        insertarDuplicado(listIn, tres);
        insertarDuplicado(listIn, cinco);
        System.out.println("tres sigue siendo " + tres);
        for (Integer integer : listIn) {
            System.out.println(" - " + integer);
        
        }
        
        
        insertarDuplicado(listSrt, "tres");
        insertarDuplicado(listSrt, "cinco");
        for (String unString : listSrt) {
            System.out.println(" - " + unString);

        }
        ArrayList<Coche> listaCoche= new ArrayList<>();
        insertarCoches(listaCoche, new Coche("Ferrachi"));
        insertarCoches(listaCoche, new Coche("Camion"));
        
        for (Coche coche : listaCoche) {
            System.out.println(" - " + coche);

        }
        
        insertarCochesMostrarUltimo(listaCoche);
        
        

    }

    //metodos no genericos
    static void insertarIntegerDosVeces(ArrayList<Integer> listaInt, int i) {
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadidos dos veces");
        //esto de abajo no afecta fuera del metodo
        //i= i+10;
        listaInt = null;
    }

    static void insertarIntegerDosVeces(ArrayList<String> listaString, String str) {
        listaString.add(str);
        listaString.add(str);
        System.out.println(str + " añadidos dos veces");

        listaString = null;
    }

    //fin de ejemplo de paso de referencia
    
    
    //entre el primer <> ponemos el nombre del tipo generico
    //esto combiente el metodo en un metodo generico
    static <Tipo> void insertarDuplicado(ArrayList<Tipo> listaGenerica, Tipo objeto) {
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto + " añadidos dos veces");
        if (objeto instanceof Integer) {
            Integer i = (Integer) objeto;
            i = i + 2;
        }

        listaGenerica = null;
    }
    //con este metodo insertamos a la lista de coches el mismo coche duplicado
    static <Coche> void insertarCoches(ArrayList<Coche> listaGenericaCoches,Coche coche){
        listaGenericaCoches.add(coche);
        listaGenericaCoches.add(coche);
        
    }
    
    //Metodo gemrico que reciba un ArrayList<Tipo>, que lo muestre (foreach) y edvuelva el ultimo valor
    
    static <Tipo> Tipo insertarCochesMostrarUltimo(ArrayList<Tipo> listaGenericaCochesMostrarUltimo){
        for (Tipo tipo : listaGenericaCochesMostrarUltimo) {
            System.out.println("- - "+ tipo.toString());
        }
        
        return  listaGenericaCochesMostrarUltimo.get(listaGenericaCochesMostrarUltimo.size()-1);
    }
}
