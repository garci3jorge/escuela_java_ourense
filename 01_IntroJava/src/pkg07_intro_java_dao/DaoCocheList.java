/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_intro_java_dao;

import java.util.ArrayList;
import java.util.List;
import pkg02_intro_java_poo.vehiculos.Coche;
import pkg02_intro_java_poo.vehiculos.FabricaCoches;
import pkg04_intro_java_poo.interfaces.IDaoCoche;

/**
 *
 * @author PC
 */
public class DaoCocheList implements IDaoCoche {

    private List<Coche> listaCoche;

    public DaoCocheList() {
        listaCoche = new ArrayList<>();
    }

    @Override
    public void crear(Coche nuevoCoche) {
        listaCoche.add(nuevoCoche);
    }

    @Override
    public Coche obtenerPorIndice(int index) {
        return listaCoche.get(index);
    }

    @Override
    public Coche obtenerPorMarca(String marca) {
        for (Coche coche : listaCoche) {
            if (coche.getMarca().equals(marca)) {
                return coche;
            }
        }
        return null;
    }

    @Override
    public void modificar(int index, Coche cocheConDatos) throws Exception {
        Coche cocheAmodificar = listaCoche.get(index);
        cocheAmodificar.setMarca(cocheConDatos.getMarca());

    }

    @Override
    public void eliminar() {
    }

    @Override
    public void eliminar(Coche objConDatosNuevos) {
    }

    @Override
    public void crear() {
    }

   
    

}
