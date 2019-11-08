/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_intro_java_poo.sistdesplazamiento;

import pkg04_intro_java_poo.interfaces.Desplazable;

/**
 *
 * @author PC
 */
public class Avion implements Desplazable{

    @Override
    public void mover(float metros) {
        volar(metros);
    }
    
    public void volar(float m){
        System.out.println("Avion vuela vuela "+ m+ " !");
    }
    
    
    
}
