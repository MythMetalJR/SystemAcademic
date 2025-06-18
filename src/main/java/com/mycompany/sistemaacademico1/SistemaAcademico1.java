/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico1;

/**
 *
 * @author User
 */
public class SistemaAcademico1 {

    public static void main(String[] args) {
        Profesor[] objprofesores = new Profesor[4];
        objprofesores[0]=new Profesor("Ing. Pedro", 25, "Barrio 30 de Abril");
        objprofesores[1]=new Profesor("Ing. Mariana", 27, "Barrio Luis Guerra");
        objprofesores[2]=new Profesor("Ing. Ana", 39, "Barrio Santa Rosa");
        objprofesores[3]=new Profesor("Ing. Eich", 35, "Barrio Central");
        
        IProfesores x = new Profesores ();
        x.imprimirDatos(objprofesores);
        System.out.println("---------------------------------------------------------------------------------------");
        Decano[] objdecanos = new Decano[4];
        objdecanos[0]=new Decano("Ing. Pedro", 25, "Barrio 30 de Abril");
        objdecanos[1]=new Decano("Ing. Mariana", 27, "Barrio Luis Guerra");
        objdecanos[2]=new Decano("Ing. Ana", 39, "Barrio Santa Rosa");
        objdecanos[3]=new Decano("Ing. Eich", 35, "Barrio Central");
        
        IDecanos x = new Decanos ();
        x.imprimirDatos(objprofesores);
    }
}
