package com.mycompany.sistemaacademico1.estudiantes;

import com.mycompany.sistemaacademico1.personasinstitucionales.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional {

    private int codigo;

    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "codigo=" + codigo + "}";
    }

    String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
