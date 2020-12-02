/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenfinal;
//HERENCIA
import java.util.ArrayList;
import examenfinal.principal.*;
import examenfinal.principal2.*;

/**
 *
 * @author raque
 */
public class Examenfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // TODO code application logic here}
        //HERENCIA
      //  principal p1= new principal();
     //  p1.show();
        
      //  memoriaram n1=new memoriaram();
       // n1.encender();
       // memoriaram n2=new memoriaram();
       // n2.encender();
       // sim n3=new sim();
       // n1.apagar();
        
        
        ///*- INTERFACE EJERCICIO 2
        principal2 p2= new principal2();
        p2.show();
       MOTO m=new MOTO();
       carro c= new carro();
       
      m.caminar();
     c.caminar();
    
       
   //----Abstractas, Usar ArrayList 3
    //ArrayList<String> Persona;
    
   // Persona =new ArrayList<String> ();
    
    //Juan j = new Juan();
   /// j.comer();
   // j.moverse();
}
