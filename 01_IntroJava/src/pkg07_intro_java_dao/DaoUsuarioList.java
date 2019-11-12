/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_intro_java_dao;

import java.util.List;
import pkg02_intro_java_poo.vehiculos.Coche;
import pkg04_intro_java_poo.interfaces.IDaoUsuario;

/**
 *
 * @author PC
 */
public class DaoUsuarioList implements IDaoUsuario {

    private List<Usuario> listaUsuario;

    @Override
    public void crear(Usuario nueUsuario) {
        listaUsuario.add(nueUsuario);
    }

    @Override
    public Usuario obtenerPorIndice(int index) {
        return listaUsuario.get(index);
    }

    @Override
    public Usuario obtenerPorNombre(String nombre) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void modificar(int index, Usuario usuarioConDatos) throws Exception {
        
        Usuario usuarioAmodificar= listaUsuario.get(index);
        usuarioAmodificar.setEdad(usuarioConDatos.getEdad());
        usuarioAmodificar.setNombre(usuarioConDatos.getNombre());
    }

}
