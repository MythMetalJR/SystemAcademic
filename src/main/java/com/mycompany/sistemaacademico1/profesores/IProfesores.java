
package com.mycompany.sistemaacademico1.profesores;

public interface IProfesores {
    public boolean agregarProfesor(Profesor profesores);
    public void imprimirDatos();
    public boolean eliminarProfesor(int id);
    public boolean actualizarProfesor(int id, Profesor nuevoProfesor);
    public Profesor buscarProfesor(int id);
}