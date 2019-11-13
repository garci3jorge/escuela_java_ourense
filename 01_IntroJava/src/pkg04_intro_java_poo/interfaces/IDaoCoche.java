/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_intro_java_poo.interfaces;

import pkg02_intro_java_poo.vehiculos.Coche;
import pkg02_intro_java_poo.vehiculos.FabricaCoches;

/**
 *
 * @author PC
 */
public interface IDaoCoche extends IGenericDao<Coche>{
    public abstract void crear() ;

   // public Coche obtenerPorIndice(int index) ;

    public Coche obtenerPorMarca(String marca) ;
    
}
