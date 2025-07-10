package com.mycompany.sistemaacademico1.estudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);

    public void imprimirDato();

    public boolean eliminarEstudiante(int id);

    public Estudiante buscarEstudiante(int id);

    public boolean actualizarEstudiante(int id, Estudiante estudiante);
}
