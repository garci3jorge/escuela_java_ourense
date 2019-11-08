/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_intro_java_poo_tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg02_intro_java_poo.vehiculos.Coche;
import pkg02_intro_java_poo.vehiculos.CocheRally;
import pkg02_intro_java_poo.vehiculos.TipoVehiculo;
import pkg02_intro_java_poo.vehiculos.Tractor;
import pkg02_intro_java_poo.vehiculos.Vehiculo;

/**
 *
 * @author PC
 */
public class OpeacionesConHerencia {
    
    
    static Coche turismo;
    static CocheRally supra;
    
    @BeforeClass
    public static void setUpClass()throws Exception{
        supra=new CocheRally();
    }
    
    @Test
    public void usandoConstructorSobrecagado(){
        supra= new CocheRally();
        supra.setMarca("Toyota");
        supra.setRozamiento(7f);
        assertTrue(supra.getRozamiento()==7f);
        assertTrue(supra.arrancar("arrancar"));
        supra.mostrarEstado();
    }
    
    @Test
    public void testPolomorfismo(){
        turismo= supra;
        supra.setRozamiento(4f);
        
        turismo.mostrarEstado();
    }
    
    @Test
    public void testEnumerado(){
        supra.setTipo(TipoVehiculo.RALLY);
        //Un enumerado es un int, limitado a la lista de valores indicados
        System.out.println("Tipo "+ supra.getTipo());
        System.out.println("Valor tipo "+supra.getTipo().ordinal());
        
        //distintas maneras de mostrar el tipo de vehiculo
        Tractor miTractorAmarillo= new Tractor();
        miTractorAmarillo.setTipo(TipoVehiculo.TRACTOR);
        System.out.println("tipo Tractor amarillo "+ miTractorAmarillo.getTipo());
        miTractorAmarillo.setTipo(TipoVehiculo.values()[1]);
        System.out.println("tipo Tractor amarillo "+ miTractorAmarillo.getTipo());
    }
    
    @Test
    public void testClaseAbstracta(){
        //Vehiculo vehiculoDescoocido = new Vehiculo
        Vehiculo vehiculoDescoocido = new Coche("Dacia");
        Vehiculo subaru= new CocheRally("Subaru");
        Vehiculo OtroTractor = new Tractor();
        vehiculoDescoocido.avanzar();
        subaru.avanzar();
        subaru.toString();
        OtroTractor.toString();
        
        System.out.println(".....");
        assertEquals(((CocheRally)subaru).getMarca(), "Subaru");
    }
}
