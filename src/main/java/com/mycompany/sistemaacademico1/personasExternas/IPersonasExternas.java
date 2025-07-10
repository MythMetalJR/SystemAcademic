
package com.mycompany.sistemaacademico1.personasExternas;


public interface IPersonasExternas {
    public boolean agregarPersonaExterna(PersonaExterna personasExternas);
    public void imprimirDatos ();
    public boolean actualizarPersonaExterna (int id, PersonaExterna personasExternas );
    public boolean eliminarPersonaExterna (int id);
   public PersonaExterna buscarPersonaExterna(int id);
}