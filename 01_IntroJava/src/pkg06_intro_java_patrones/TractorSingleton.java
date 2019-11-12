/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_intro_java_patrones;

import java.util.Random;
import pkg02_intro_java_poo.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class TractorSingleton extends Coche{

    private TractorSingleton() {
        
    }
    private static TractorSingleton miBarreiros;
    
    public static TractorSingleton getTractor() throws Exception{
        if (TractorSingleton.miBarreiros == null) {
            TractorSingleton.miBarreiros = new TractorSingleton();
            TractorSingleton.miBarreiros.setMarca("La matricula de mi barreiros sera: "+ (new Random()).nextInt());
            
        }
        return TractorSingleton.miBarreiros  ;
    }
    
    
}
