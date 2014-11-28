
package com.br.maven.padroes;



/**
 *
 * @author David
 */
public class Singleton {
    
  static final Singleton instance = new Singleton();

    private Singleton() {
       
    }
    
    public void funcaoQuePossuiUmNomeDuvidoso(){
       
    }

    public static Singleton getInstance() {
        return instance;
    }
    
}
