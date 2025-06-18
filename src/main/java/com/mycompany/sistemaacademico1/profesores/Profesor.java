/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.profesores;

/**
 *
 * @author User
 */
public abstract class Profesor extends PersonalAcademico{
    
    private Escalafon escalafon;

    public Profesor(Escalafon escalafon, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
    }

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }

    @Override
    public String toString() {
        return "Profesor{" + "escalafon=" + escalafon + '}';
    }



    
}