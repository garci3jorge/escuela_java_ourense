/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_intro_java_poo.interfaces;

import pkg02_intro_java_poo.vehiculos.Coche;
import pkg07_intro_java_dao.Usuario;

/**
 *
 * @author PC
 */
public interface IDaoUsuario extends IGenericDao<Usuario> {

    // se pueden sobrescribir, pero no es necesario
   // public abstract void crear(Usuario nuevoUsuario);
    
    public Usuario obtenerPorIndice(int index);
    
    public Usuario obtenerPorNombre(String nombre);
}
