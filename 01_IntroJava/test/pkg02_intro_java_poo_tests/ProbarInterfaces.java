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
import pkg02_intro_java_poo.vehiculos.Vehiculo;
import pkg03_intro_java_poo.sistdesplazamiento.Avion;
import pkg03_intro_java_poo.sistdesplazamiento.BicicletaElectrica;
import pkg03_intro_java_poo.sistdesplazamiento.Monopatin;
import pkg03_intro_java_poo.sistdesplazamiento.MonopatinElectrico;
import pkg04_intro_java_poo.interfaces.Desplazable;
import pkg04_intro_java_poo.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class ProbarInterfaces {
    
    public ProbarInterfaces() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    
    @Test
    public void creandoDesplazables() {
        Avion miAvionDeLosLunes = new Avion();
        miAvionDeLosLunes.mover(50.1f);
        miAvionDeLosLunes.volar(500.0f);
        
        Desplazable d1= new Avion();
        d1.mover(20);
        
        Avion avionD1 =(Avion) d1;
        avionD1.volar(7000f);
    }
    
    @Test
    public void creandoMonopatinDesplazable(){
        Monopatin miMonopatin =new Monopatin();
        miMonopatin.andar(10f);
        miMonopatin.rodar(15f);
        
        Desplazable d2 = new Monopatin();
        d2.mover(0);
    }
    @Test
    public void moviendoVehiculosDesplazables(){
        CocheRally cocheRally= new CocheRally("COCHE RALLY PROPIO");
        //Facetas poliorfismo:
        Coche cocheR = cocheRally;        
        Vehiculo vehiculoR= cocheRally;
        Desplazable desplazableR= cocheRally;
        cocheR.arrancar();
        //vehiculoR.mostrarEstado();
        desplazableR.mover(10f);
        assertTrue(desplazableR instanceof CocheRally);
        if (desplazableR instanceof CocheRally) {
            ((CocheRally)desplazableR).setRozamiento(10f);
            assertEquals(((CocheRally)desplazableR).getRozamiento(),10f,0.001f);
            
        }                        
    }
    @Test
    public void arrayInterfaces(){
        Electrico[] cosasElectricas = new Electrico[]{
            new MonopatinElectrico(),
            new BicicletaElectrica()            
        };
        cosasElectricas[0].cargarBateria(10f);
        cosasElectricas[1].cargarBateria(20f);
        if (cosasElectricas.length!=2) {
            fail ("No tiene 2 elementos");
            
        }
        
    }
}
