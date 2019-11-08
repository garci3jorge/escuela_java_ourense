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
public class Monopatin implements Desplazable{

    @Override
    public void mover(float metros) {
        
    }
    
    public void andar(float anda){
        System.out.println("Monopatin anda anda "+ anda+ " !");
    }
    public void rodar(float rueda){
        System.out.println("Monopatin rueda ruda "+ rueda+ " !");
    }
    
}
