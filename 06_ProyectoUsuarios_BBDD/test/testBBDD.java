/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg06_proyectousuarios_bbdd.ServicioUsuarios;

/**
 *
 * @author PC
 */
public class testBBDD {

    @Test
    public void testProbarleerUnoPorEmail() {
        ServicioUsuarios miMetodo = new ServicioUsuarios();
        assertEquals("JORGE@JORGE.COM", miMetodo.leerUnoPorEmail("jorge@jorge.com").get(0).getEmail());

    }
    @Test
    public void testProbarleerUnoPorID() {
        ServicioUsuarios miMetodo2 = new ServicioUsuarios();
        assertEquals(1, miMetodo2.leerUnoPorID(1).get(0).getId());
    }
    
     @Test
    public void testInsertarUsuarioInvaldo() {
        ServicioUsuarios miMetodo3 = new ServicioUsuarios();
        
    }
    
}
