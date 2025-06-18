/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico1.decanos;

/**
 *
 * @author User
 */
public abstract class Decano extends PersonalAcademico{
    private String nivel;

    public Decano(String nivel, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

   

    @Override
    public String toString() {
        return "Decano{" + "nivel=" + nivel + '}';
    }


    
}