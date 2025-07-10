package com.mycompany.sistemaacademico1.profesores;

import com.mycompany.sistemaacademico1.personalacademicos.PersonalAcademico;

public class Profesor extends PersonalAcademico {

    private Escalafon escalafon;

    public Profesor(Escalafon escalafon, double sueldo, String dedicacion, String correoInstitucional, int id, String nombre, String correoPersonal) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
        super.toString();
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }

    public Escalafon getEscalafon() {
        return escalafon;
    }

    @Override
    public String toString() {
        return "Profesores{" + "escalafon=" /*+ escalafon */ + " " + super.toString() + '}';
    }

    public Object getSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
