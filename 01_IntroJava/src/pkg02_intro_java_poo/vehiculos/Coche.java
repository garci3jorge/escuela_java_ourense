/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo.vehiculos;

/**
 *
 * @author PC
 */
public class Coche extends Vehiculo {

//    public Coche(){
//    Constructor por defecto
//    }
    String marca;
    private int numRuedas = 4;
    protected boolean arrancado;

    // en el momento en el que creamos un constructor el de por 
    // defecto deja de ser implementado por java
    public Coche() {
        numRuedas = 4;
        marca = "SIN MARCA";
        tipo = TipoVehiculo.TURISMO;
    }

    public Coche(String marca) {
        this.marca = marca;
        this.arrancado = false;
        tipo = TipoVehiculo.TURISMO;
    }

    public void arrancar() {
        System.out.println(this.marca + " ha arrancado");
        arrancado = true;
    }

    //sobrecarga de metodo arrancar
    public void arrancar(int posicionLlave) {
        arrancado = posicionLlave == 4;
        System.out.println(this.marca + (arrancado ? " ha arrancado"
                : " fallo al arrancar"));
        //if posicionLlave==4 arrancado=true; else arrancado=false
    }

    public boolean arrancar(String orden) {
        arrancado = "arracar".equals(orden);
        return arrancado;
//        if (orden.equals("arrancar")) {
//            arrancado = true;
//        } else {
//            arrancado = false;
//        }
    }

    public void mostrarEstado() {
        System.out.println("Coche " + getMarca() + ", "
                + (arrancado ? " ha arrancado"
                        : " apagado"));
    }

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

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    @Override
    public void avanzar() {
        System.out.println("hola amigos");
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", numRuedas=" + numRuedas + ", arrancado=" + arrancado + '}';
    }
    
    public void mover(float m){
        avanzar();
        System.out.println("metros "+m);
    }

}
