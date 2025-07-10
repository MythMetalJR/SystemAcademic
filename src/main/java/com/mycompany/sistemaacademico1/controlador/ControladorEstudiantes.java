package com.mycompany.sistemaacademico1.controlador;

import com.mycompany.sistemaacademico1.estudiantes.Estudiante;
import com.mycompany.sistemaacademico1.estudiantes.Estudiantes;
import com.mycompany.sistemaacademico1.estudiantes.IEstudiantes;
import com.mycompany.sistemaacademico1.vista.VistaEstudiante;
import java.util.ArrayList;
import java.util.List;

public class ControladorEstudiantes {

    private VistaEstudiante vistaEstudiantes;
    private IEstudiantes iEstudiantes;

    public ControladorEstudiantes(VistaEstudiante vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.iEstudiantes = new Estudiantes(100) {
        };
    }

    public void procesoControladorEstudiante() {
        try {
            String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
            String codigoStr = vistaEstudiantes.getCodigoEstudiante();

            // Validar si el código es un número
            int codigoEstudiante;
            try {
                codigoEstudiante = Integer.parseInt(codigoStr);
            } catch (NumberFormatException e) {
                System.out.println("️ Error: El código del estudiante debe ser un número.");
                return;
            }

            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            String correoInstitucional = vistaEstudiantes.getCorreoInstitucionalEstudiante();
            String correoPersonal = vistaEstudiantes.getCorreoPersonalEstudiante();

            // Creamos el estudiante
            Estudiante estudiante = new Estudiante(
                    codigoEstudiante,
                    correoInstitucional,
                    1, // Valor fijo, puedes cambiarlo si necesitas
                    nombreEstudiante,
                    correoPersonal,
                    cedulaEstudiante
            );

            // Agregamos y mostramos
            iEstudiantes.agregarEstudiante(estudiante);
            iEstudiantes.imprimirEstudiantes();

        } catch (Exception e) {
            System.out.println("️ Error inesperado al procesar los datos del estudiante: " + e.getMessage());
        }
    }


}
