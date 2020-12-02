/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author raque
 */
public abstract class Persona {
    
    private String nombre;
    
    public Persona(){}
    
    public void comer(){
        System.out.println("--------Abstractas, Usar ArrayList "
                + "////"
                + " El "+nombre+" esta comiendo.");
     
    }
    public abstract void moverse();
    
    public void setnombre(String s){
        nombre = s;
    }
    public String getNombre(String s){
        nombre= s;
    }
    public String getNombre(){
        return nombre;
    }
}
