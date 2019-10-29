
package senasalud;

import java.util.Scanner;


public class SenaSalud {

   
    public static void main(String[] args) {
        String nom, ape, ani;
        int ed;
  Scanner nombre =new Scanner (System.in);
  System.out.println("Digite su Nombre");
  nom=nombre.next();
  
   
  Scanner apellido =new Scanner (System.in);
  System.out.println("Digite su Apellido");
  ape=apellido.next();
  
                
  Scanner edad =new Scanner (System.in);
  System.out.println("Ingrese su Edad");
  ed=edad.nextInt();
  
  Scanner animal =new Scanner (System.in);
  System.out.println("Cual es su animal favorito");
  ani=animal.next();
   
  
  
  
  
  
  System.out.println("Su nombre es:"+nom);
  System.out.println("Su Apellido es:"+ape);
  System.out.println("Su Edad es:"+ed);
 System.out.println("Su Animal favorito es:"+ani);
  
    }
    
}

