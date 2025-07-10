package com.mycompany.sistemaacademico1.trabajadores;

import java.util.List;

public interface ITrabajadores {

    void agregarTrabajador(Trabajador trabajador);

    Trabajador obtenerTrabajador(int id);

    List<Trabajador>
            obtenerTodosLosTrabajadores();

    void actualizarTrabajador(Trabajador trabajador);

    void eliminarTrabajador(int id);

}
