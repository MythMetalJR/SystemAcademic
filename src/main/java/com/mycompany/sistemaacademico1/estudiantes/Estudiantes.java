package com.mycompany.sistemaacademico1.estudiantes;

public class Estudiantes implements IEstudiantes{
    Estudiante[] estudiantes= new Estudiante[3];
     @Override
     public boolean agregarEstudiantes(Estudiante estudiante){                          
         
         
         estudiantes[0]=estudiante;
     
     return true;
     }
     
     public void mostrarEstudiantes(){
         /*for (int i = 0; i <1 ; i++) {
             System.out.println("Datos"+estudiantes.toString());
         */
         System.out.println("Datos+"+estudiantes[0].toString());
         
         
     //return true;
     }
     /*
     public boolean modificarEstudiantes(){
         
     return true;
     }
     
     public boolean eliminarEstudiantes(){
         
     return true;
     }
     
     public boolean buscarEstudiantes(){
         
     return true;
     }*/
     
     
}