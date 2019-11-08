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

/**
 *
 * @author PC
 */
public class ProbarClasesInterfazGenericaYAnidadas {
    
    static class ClasePequePos{//es necesario ponerle static para poder usar sus metodos
        float x,y;
        public ClasePequePos(float x,float y){
            this.x=x;
            this.y=y;
            
        }

        @Override
        public String toString() {
            return "ClasePequePos{" + "x=" + x + ", y=" + y + '}';
        }
        
    }
    @Test
    public void probarClaseAnidada(){
        ClasePequePos unPunto2D= new ClasePequePos(3f, 5f);
        System.out.println("Punto 2D "+ unPunto2D.toString());
    }
    @Test
    public void testearClaseAnidada(){
        ProbarClasesInterfazGenericaYAnidadas.ClasePequePos c;
        c=new ProbarClasesInterfazGenericaYAnidadas.ClasePequePos(1f, 2f);
    }
    
    
    public ProbarClasesInterfazGenericaYAnidadas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
