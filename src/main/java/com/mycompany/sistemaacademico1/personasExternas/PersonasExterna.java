/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.personasExternas;

/**
 *
 * @author User
 */
public abstract class PersonaExterna extends Persona{
    
    private String descripcion;

    public PersonaExterna(String descripcion, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "PersonaExterna{" + "descripcion=" + descripcion + '}';
    }
    
  
    public boolean verificarCedula(){
        return true;
    }
}