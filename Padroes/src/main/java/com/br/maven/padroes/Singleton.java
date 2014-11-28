
package com.br.maven.padroes;



/**
 *
 * @author David
 */
public class Singleton {
    
  static final Singleton instance = new Singleton();

    private Singleton() {
       funcaoQueNaoFazNada();
    }
    
    public void funcaoQueNaoFazNada(){
            
        System.out.println("Aloha");
       
    }

    public static Singleton getInstance() {
        return instance;
    }
    
}
