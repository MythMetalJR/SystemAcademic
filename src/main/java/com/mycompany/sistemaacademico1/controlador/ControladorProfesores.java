
package com.mycompany.sistemaacademico1.controlador;

import com.mycompany.sistemaacademico1.profesores.IProfesores;
import com.mycompany.sistemaacademico1.profesores.Profesores;
import com.mycompany.sistemaacademico1.vista.VistaProfesor;
import com.mycompany.sistemaacademico1.profesores.Profesor;

public class ControladorProfesores {
    
    private VistaProfesor vistaProfesores;
    private IProfesores iProfesores;
    
    public ControladorProfesores (VistaProfesor vistaProfesores){
        
        this.vistaProfesores=vistaProfesores;
        this.iProfesores= new Profesores();
    }
    
    public void procesoControladorProfesor(){
        try {
        String nombreProfesor=vistaProfesores.getNombreProfesor();
        int idProfesor=Integer.parseInt(vistaProfesores.getIdProfesor());
        String cedulaProfesor=vistaProfesores.getCedulaProfesor();
        String correoPersonalProfesor=vistaProfesores.getCorreoPersonalProfesor();
        String correoInstitucionalProfesor=vistaProfesores.getCorreoInstitucionalProfesor();
        String dedicacionProfesor=vistaProfesores.getDedicacionProfesor();
        double sueldoProfesor=Double.parseDouble(vistaProfesores.getSueldoProfesor());
        
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
