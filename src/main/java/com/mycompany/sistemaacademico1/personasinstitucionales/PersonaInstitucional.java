
package com.mycompany.sistemaacademico1.personasinstitucionales;

import com.mycompany.sistemaacademico1.personas.Persona;

public class PersonaInstitucional extends Persona{
    
    //atributos
    private String correoInstitucional;
    
    //

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    


    @Override
    public String toString() {
        return "PersonaInstitucional{" +super.toString()+ "correoInstitucional=" + correoInstitucional +'}';
    }

}