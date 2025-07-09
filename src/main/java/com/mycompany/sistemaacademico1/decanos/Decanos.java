
package com.mycompany.sistemaacademico1.decanos;



public class Decanos implements IDecanos {
    
    public String agregarDecano(){
        return "";
    }
    public void imprimirDatos (Decanos [] Decano){
        for (int i =0; i < Decano.length; i++){
        System.out.println("Datos decano: "+ Decano[i].toString());
        }
    }
    
 
}