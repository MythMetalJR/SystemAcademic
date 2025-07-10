
package com.mycompany.sistemaacademico1.personasExternas;
        

public class PersonasExternas implements IPersonasExternas {
    
    private PersonaExterna [] personasExternas;
    private int totalPersonasE;

    public PersonasExternas(int dimension) {
        personasExternas = new PersonaExterna[dimension];
        totalPersonasE=0;
    }
    
    
    public boolean agregarpersonaExterna(PersonaExterna personaExterna){
        if(totalPersonasE == personasExternas.length){
             return false;     
        }else{
            personasExternas[totalPersonasE] = personaExterna;
            totalPersonasE = totalPersonasE +1 ;
            return true;    
        }        
    }
    
    public void imprimirDatos (){
        for (int i = 0; i < totalPersonasE; i++) {
            System.out.println("-----Persona Invitada-------");
            System.out.println("Datos de la persona: " + personasExternas[i].getNombre());
            System.out.println("Cedula: " +  personasExternas[i].getCedula());
            System.out.println("Correo: " + personasExternas[i].getCorreoPersonal());
            System.out.println("ID:"+ personasExternas[i].getId());
            System.out.println("Descripcion : " + personasExternas[i].getDescripcion());
            System.out.println(" ");
        }
    }
    
    public boolean actualizarPersonaExterna(int id, PersonaExterna personaExterna){
        for (int i = 0; i < totalPersonasE; i++) {
            personasExternas[i]= personaExterna;
            imprimirDatos();
            return true;
        }
        return true;
    }
    
    public boolean eliminarPersonaExterna(int id) {
        for (int i = 0; i < totalPersonasE; i++) {
            if (personasExternas[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j <  totalPersonasE - 1; j++) {
                    personasExternas[j] = personasExternas[j + 1];
                }
                personasExternas[ totalPersonasE - 1] = null;
                 totalPersonasE--;
                System.out.println("Persona invitada eliminada");
                return true;
            }
        }
        return false;
    }
    
    public PersonaExterna buscarPersonaExterna(int id) {
    for (int i = 0; i < totalPersonasE; i++) {
        if (personasExternas[i] != null && personasExternas[i].getId() == id) {
            return personasExternas[i];
        }
    }
    return null;
    }

    @Override
    public boolean agregarPersonaExterna(PersonaExterna personasExternas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}