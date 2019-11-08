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
public class Tractor extends Vehiculo {

    //protected boolean arrancado;
    // el tractor no tiene marca y solo tiene tipo y si le quieres meter el arrancadpo pues es asi CREO!!!!
//    public void mostrarEstado() {
//        System.out.println("Coche " + getTipo()+ ", "
//                + (arrancado ? " ha arrancado"
//                        : " apagado"));
//    }
    public Tractor() {
        tipo = TipoVehiculo.TRACTOR;
        //this.arrancado= false;
    }

    @Override
    public void avanzar() {

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void mover(float m) {
        avanzar();
        System.out.println("metros " + m);
    }

}
