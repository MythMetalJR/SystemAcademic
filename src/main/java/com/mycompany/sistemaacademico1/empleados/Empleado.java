/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.empleados;
import com.mycompany.sistemaacademico1.personasinstitucionales.PersonaInstitucional;
/**
 *
 * @author User
 */
public abstract class Empleado extends PersonaInstitucional{
    //atributos
    private final double sueldo;
    
    //metodos

    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

 
    @Override
    public String toString() {
        return "Empleado{" + "sueldo: " + sueldo + super.toString()+ '}';
    }


    
}