/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico1;

import com.mycompany.sistemaacademico1.estudiantes.Estudiante;
import com.mycompany.sistemaacademico1.estudiantes.Estudiantes;
import com.mycompany.sistemaacademico1.estudiantes.IEstudiantes;

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

        System.out.println("DATOS DE LOS ESTUDIANTES");
        Estudiante[] objestudiantes = new Estudiante[4];
        objestudiantes[0] = new Estudiante(259, "josue@espoch.com", 5, "Josue Rodriguez", "josue@gmail.com", "2250184795");
        objestudiantes[1] = new Estudiante(260, "sara@espoch.com", 5, "Sara Gonzalez", "gonzales@gmail.com", "8945612358");
        objestudiantes[2] = new Estudiante(261, "Domenica@espoch.com", 5, "Domenica Loor", "Domeloo@gmail.com", "1748596323");
        objestudiantes[3] = new Estudiante(262, "Licet@espoch.com", 5, "Licet Ibarra", "Ibarra@gmail.com", "1587429635");

        IEstudiantes x = new Estudiantes();
        x.imprimirDatos(objestudiantes);

    }
}
