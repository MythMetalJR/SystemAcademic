/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.profesores;

/**
 *
 * @author User
 */
public class Profesores implements IProfesores {
    
    Profesor[] profesores = new Profesor[3];
    @Override
    public boolean agregarProfesores(Profesor profesor){
        profesores [0]=profesor;
    return true;
    }
    public void mostrarProfesores(){
        System.out.println("Datos"+profesores[0].toString());
    }
    
    
    
    
    
    
    
    
    //private Profesor [] = profesor;
   /* public Profesores(int dimension) {
    }
    
    public String agregarProfesor(){
    
    return "";
    }
    public boolean verficarCedula(){
    
    return true;
    }*/
}
