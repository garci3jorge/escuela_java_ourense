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
import pkg02_intro_java_poo.vehiculos.CocheRally;

/**
 *
 * @author PC
 */
public class ProbarColecciones {
    
    public ProbarColecciones() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    //MALA FORMA
    @Test
    public void testArrayListNoGenerica() {
        ArrayList lista = new ArrayList();
        //con el arraylist podemos mezclar curas con merinas
        //no usar nunca
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("texto este");
        lista.add(100);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento [  "+i+"] = "+lista.get(i).toString());
            
        }
                
        
    }
    @Test
    public void testArrayListGenericOK() {
        ArrayList<CocheRally> misCoches = new ArrayList<CocheRally>();
       misCoches.add(new CocheRally("Subaru Lunes"));
       misCoches.add(new CocheRally("Ferrari Martes"));
       misCoches.add(new CocheRally("Porche Miercoles"));
       misCoches.add(new CocheRally("Golfito Jueves"));
        
        misCoches.get(2).arrancar("encender");
        misCoches.get(2).mostrarEstado();
        
        for (CocheRally miCoche : misCoches) {
            miCoche.avanzar();
        }
        
                
        
    }
}
