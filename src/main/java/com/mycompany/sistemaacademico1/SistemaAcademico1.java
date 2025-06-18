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
