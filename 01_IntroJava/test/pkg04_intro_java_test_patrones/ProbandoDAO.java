/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_intro_java_test_patrones;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg04_intro_java_poo.interfaces.IDaoCoche;
import pkg04_intro_java_poo.interfaces.IDaoUsuario;
import pkg07_intro_java_dao.DaoCocheList;
import pkg07_intro_java_dao.DaoCocheMap;
import pkg07_intro_java_dao.DaoUsuarioList;

/**
 *
 * @author PC
 */
public class ProbandoDAO {
    
    // tambien se puede hacer un metodo que implemente a ambos test
    @Test
    public void testDaoCocheList() {
        IDaoCoche daoCoche= new DaoCocheList();
        daoCoche.crear("coche1");
        daoCoche.crear("coche2");
        daoCoche.crear("coche3");
        daoCoche.crear("coche4");
        
        assertEquals(daoCoche.obtenerPorIndice(1).getMarca(), "coche2");
        assertEquals(daoCoche.obtenerPorMarca("coche3").getMarca(), "coche3");
    }
    
    @Test
    public void testDaoCocheHashMap() {
        DaoCocheMap daoCoche= new DaoCocheMap();
        daoCoche.crear("coche1");
        daoCoche.crear("coche2");
        daoCoche.crear("coche3");
        daoCoche.crear("coche4");
        
        assertEquals(daoCoche.obtenerPorIndice(1).getMarca(), "coche2");
        assertEquals(daoCoche.obtenerPorMarca("coche3").getMarca(), "coche3");
    }
    
    @Test
    public void testUsuarioDao()throws Exception{
        IDaoUsuario daoUsuario= new DaoUsuarioList();
    }
}
