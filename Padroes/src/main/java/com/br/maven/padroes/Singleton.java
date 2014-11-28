
package com.br.maven.padroes;



/**
 *
 * @author David
 */
public class Singleton {
    
  static final Singleton instance = new Singleton();

    private Singleton() {
       
    }
    
    public void operacaoDemorada(){
       
    }

    public static Singleton getInstance() {
        return instance;
    }
    
}
