/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo.vehiculos;

import pkg04_intro_java_poo.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class CocheElectrico extends Coche implements Electrico{

    @Override
    public void cargarBateria(double voltios) {
        System.out.println("Carga de la bateria: "+ voltios);
    }
    
}
