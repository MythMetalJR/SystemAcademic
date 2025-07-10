
package com.mycompany.sistemaacademico1.personalacademicos;
import com.mycompany.sistemaacademico1.empleados.Empleado;

public class PersonalAcademico extends Empleado {

    public PersonalAcademico(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
    }
    // public abstract boolean verificarCedula(); 
    
    @Override
    public String toString() {
        return "personalAcademico{" + super.toString()+'}';
    }
    
    
    
}