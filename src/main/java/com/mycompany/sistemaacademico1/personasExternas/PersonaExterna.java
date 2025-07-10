/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.personasExternas;

import com.mycompany.sistemaacademico1.personas.Persona;

/**
 *
 * @author User
 */
public class PersonaExterna extends Persona {

    private String descripcion;

    public PersonaExterna(int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
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

}
