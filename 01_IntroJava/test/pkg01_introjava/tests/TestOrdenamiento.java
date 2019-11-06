/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.Main;

/**
 *
 * @author PC
 */
public class TestOrdenamiento {

    public TestOrdenamiento() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void probarOrdenamiento() {
        int[] arrayNumerico = {};
        int[] arrayNumericoOrdenado = {};

        assertArrayEquals(Main.ordenarArray(arrayNumerico), arrayNumericoOrdenado);
        
    }

}
