/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_intro_java_patrones;

import java.util.Random;
import pkg02_intro_java_poo.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class CocheEspecialUnico extends Coche {

    private static CocheEspecialUnico unicoCocheEsp;

    private CocheEspecialUnico() {
        super();
    }

    public static CocheEspecialUnico getInstancia() throws Exception {
        if (CocheEspecialUnico.unicoCocheEsp == null) {
            CocheEspecialUnico.unicoCocheEsp = new CocheEspecialUnico();
            CocheEspecialUnico.unicoCocheEsp.setMarca("Unico Coche "+ (new Random()).nextInt());
        }
        return CocheEspecialUnico.unicoCocheEsp;

    }

}
