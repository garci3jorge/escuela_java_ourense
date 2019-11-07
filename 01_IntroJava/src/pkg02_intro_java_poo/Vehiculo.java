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
public abstract class Vehiculo {
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }
    //Este metodo esta declarado e implementado
    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    //este metodo esta declarado pero no implementado (metodo abstracto)
    // este metodo abstracto obliga a que la clase en la que esta declarado
    //se abstracta
    public abstract void avanzar();

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + '}';
    }
    
    
    
    
}
