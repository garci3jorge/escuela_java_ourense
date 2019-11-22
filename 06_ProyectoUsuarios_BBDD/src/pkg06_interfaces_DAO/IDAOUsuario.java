/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_interfaces_DAO;

import pkg06_proyectousuarios_bbdd.Usuario;

/**
 *
 * @author PC
 */
public interface IDAOUsuario {
    //Aqui crear metodos de crear, leer, actualizar y eliminar
    //TODO igual lo que tenemos que hacer aqui es hacer el insert, update , leer y deletear en la base de datos

    public abstract Usuario crear(Usuario nuevoUsuario) throws Exception;

    public abstract void modificar(int id, String email, String password, String nombre, int edad);

   // public abstract modificarUsuario();
    
    public abstract boolean eliminar();
    
    
}
