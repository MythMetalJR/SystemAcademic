/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.personasExternas;

/**
 *
 * @author User
 */
public class PersonasExternas {
    public String agregarPersonaExterna() {
        return "";
    }
public void imprimirDatos ( PersonaExterna[] personasExternas  ){
        for (int i=0; i<personasExternas.length; i++ ){
            System.out.println("Datos del Estudiante: "+ personasExternas[i].toString());
    }
}
}
