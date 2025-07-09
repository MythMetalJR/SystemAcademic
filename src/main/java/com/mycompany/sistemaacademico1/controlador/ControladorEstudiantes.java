/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaacademico1.controlador;

import com.mycompany.sistemaacademico1.estudiantes.Estudiante;
import com.mycompany.sistemaacademico1.estudiantes.Estudiantes;
import com.mycompany.sistemaacademico1.estudiantes.IEstudiantes;
import com.mycompany.sistemaacademico1.vista.VistaEstudiante;

/**
 *
 * @author User
 */
public class ControladorEstudiantes {
    
    private VistaEstudiante vistaEstudiantes;
    private IEstudiantes iEstudiantes;
    
    public ControladorEstudiantes (VistaEstudiante vistaEstudiantes){
        
        this.vistaEstudiantes=vistaEstudiantes;
        this.iEstudiantes= new Estudiantes();
    }
    
    public void procesoControladorEstudiante(){
        try {
            String cedulaEstudiante=vistaEstudiantes.getCedulaEstudiante();
            int codigoEstudiante=Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
            String nombreEstudiante=vistaEstudiantes.getNombreEstudiante();
            String correoInstitucional=vistaEstudiantes.getCorreoInstitucionalEstudiante();
            String correoPersonal=vistaEstudiantes.getCorreoPersonalEstudiante();
            
            Estudiante estudiante = new Estudiante(codigoEstudiante, correoInstitucional, 1, nombreEstudiante, correoPersonal, cedulaEstudiante);
            iEstudiantes.agregarEstudiantes(estudiante);
            iEstudiantes.mostrarEstudiantes();
            
        } catch (Exception e) {
            
            System.out.println("Error");
            
        }
    }
    
    
}
