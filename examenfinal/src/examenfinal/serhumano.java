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
public class serhumano {
    String nombre;
    int edad;
    String dpi;
    
    
   public serhumano(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
 
  }
   
   public serhumano(String dpi){
       this.dpi = dpi;
   }
   
   public void caminar(){
       System.out.println("Soy "  +nombre+", tengo " +edad+ "años y estoy caminando una marraton");
   }
   
   public void caminar(int km){
       System.out.println("He caminado"  +km+   "Kilometos");
   }
}
