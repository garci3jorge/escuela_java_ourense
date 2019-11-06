/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo_tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg02_intro_java_poo.Coche;

/**
 *
 * @author PC
 */
public class Test_intro_java_poo {

    @Test
    public void creandoObjetos() {
        Coche miCoche = null;

        miCoche = new Coche();
        System.out.println("Texto de coche " + miCoche.toString());

        Coche miCocheFindes = new Coche();

        assertNotNull(miCoche);
        assertNotNull(miCocheFindes);
        assertNotEquals(miCoche, miCocheFindes);

        miCoche.setMarca("kia");
        miCocheFindes.setMarca("hummer");

        System.out.println("micoche.marca " + miCoche.getMarca());
        System.out.println("micocheFindes " + miCocheFindes.getMarca());

        miCocheFindes = miCoche;
        assertEquals(miCoche, miCocheFindes);
        
        miCoche.setMarca("hummer limusina");
        
        System.out.println("micocheFindes otro " + miCocheFindes.getMarca());
        
        
        //intro al polimorfismo
        Object refAmiCoche = miCoche;
        Object refCoche= new Object();
        //no podemos acceder porque no tiene la forma de coche
        assertTrue(refAmiCoche.equals(miCoche));
        System.out.println(refAmiCoche.toString());
        
        //asignar un nuevo objeto a coche
        miCoche = (Coche)refCoche;
        
        
    }
}
