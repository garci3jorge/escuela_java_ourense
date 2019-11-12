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
import pkg06_intro_java_patrones.CocheEspecialUnico;
import pkg06_intro_java_patrones.TractorSingleton;

/**
 *
 * @author PC
 */
public class ProbandoUnicaInstancia {

    @Test
    public void intentarUnicaIns() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico Coche 1");
        miUnicoCoche.mostrarEstado();
    }

    @Test
    public void intentarUnicaInsBis() throws Exception {
        CocheEspecialUnico miUnicoCoche =CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico miUnicoCoche = getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico Coche 2");
        miUnicoCoche.mostrarEstado();
    }

    @Test
    public void intentarUnicaInsTris() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico Coche 3");
        miUnicoCoche.mostrarEstado();
    }
    
    @Test
    public void intentarTractor1() throws Exception {
        TractorSingleton UnicoMiBarreiro= TractorSingleton.getTractor();
        //CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico Coche 3");
        UnicoMiBarreiro.mostrarEstado();
    }
    @Test
    public void intentarTractor2() throws Exception {
        TractorSingleton UnicoMiBarreiro= TractorSingleton.getTractor();
        //CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico Coche 3");
        UnicoMiBarreiro.mostrarEstado();
    }

    

}
