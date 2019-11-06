/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo;

/**
 *
 * @author PC
 */
public class Coche {

//    public Coche(){
//    Constructor por defecto
//    }
    private String marca;
    private int numRuedas = 4;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String nuevaMarca) {
        /*
        cuando existe una variabler local con el mismo nombre
        obliga a usar this para acceder a la variable miembro
        con el mismo nombre
         */
        this.marca = nuevaMarca;
    }

}
