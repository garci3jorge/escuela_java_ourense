/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_intro_java_poo.interfaces;

/**
 *
 * @author PC
 */
public interface IGenericDao<T> {

    void crear(T objetoNuevo);

    T obtenerPorIndice(int index);
    
    void modificar (int index,T obConDatosNuevos)throws Exception;
    
    void eliminar();
    void eliminar(T objConDatosNuevos);

}
