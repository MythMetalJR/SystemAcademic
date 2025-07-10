
package com.mycompany.sistemaacademico1.trabajadores;

import com.mycompany.sistemaacademico1.empleados.Empleado;

public class Trabajador extends Empleado{
    //atributos
    private String gremio;
    
    //constructor
    public Trabajador(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }
    
    //Getters y Set

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "gremio=" + gremio + '}';
    }
    
    
    
    
    
}

