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
import pkg02_intro_java_poo.vehiculos.Coche;
import pkg02_intro_java_poo.vehiculos.CocheRally;

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

        //no podemos acceder porque no tiene la forma de coche
        assertTrue(refAmiCoche.equals(miCoche));
        System.out.println(refAmiCoche.toString());

        //asignar un nuevo objeto a coche
//        Object refCoche = new Object();
//        miCoche = (Coche) refCoche;
    }

    @Test
    public void testSobrecargaMetodos() {
        Coche miOtroCoche = null;
        miOtroCoche = new Coche();
        miOtroCoche.arrancar();
        assertTrue(miOtroCoche.isArrancado());

        miOtroCoche.arrancar(1);
        assertFalse(miOtroCoche.isArrancado());
        miOtroCoche.arrancar(4);
        assertTrue(miOtroCoche.isArrancado());

    }
    
    

}
