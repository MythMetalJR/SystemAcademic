package com.mycompany.sistemaacademico1.estudiantes;

public class Estudiantes implements IEstudiantes{
 
   
     public Estudiante agregarEstudiante(){
     
     return null;
     }
     public void imprimirDatos ( Estudiante[] estudiantes  ){
        for (int i=0; i<estudiantes.length; i++ ){
            System.out.println("Id: "+ estudiantes[i].getId ());
            System.out.println("Nombre: "+ estudiantes[i].getNombre ());
            System.out.println("Correo Personal: "+ estudiantes[i].getCorreoPersonal());
            System.out.println("Correo Institucional: "+ estudiantes[i].getCorreoInstitucional());
            System.out.println("Cedula: "+ estudiantes[i].getCedula());   
        }

    
    }
}