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
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import pkg04_intro_java_poo.interfaces.IDaoCoche;

/**
 *
 * @author PC
 */
public class DaoCocheMap implements IDaoCoche{

    private int ultimoIndex;
    private Map<String, Coche> mapaCocheString;
    private Map<Integer, Coche> mapaCocheInteger;
    Coche miCiche = new Coche();

    public DaoCocheMap() {
        mapaCocheString = new HashMap<>();
        mapaCocheInteger = new HashMap<>();
        ultimoIndex = 0;
    }

    @Override
    public void crear(Coche nuevoCoche) {
        mapaCocheString.put(nuevoCoche.getMarca(), nuevoCoche);
        mapaCocheInteger.put(ultimoIndex, mapaCocheString.get(nuevoCoche.getMarca()));
        ultimoIndex++;

    }

    @Override
    public Coche obtenerPorIndice(int index) {
        return mapaCocheInteger.get(index);
    }

    @Override
    public Coche obtenerPorMarca(String marca) {
        return mapaCocheString.get(marca);
    }

}
