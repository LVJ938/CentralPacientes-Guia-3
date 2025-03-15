package Modelo;
/**
 *
 * @author Luis Vargas
 */
public class NodoPaciente {
    
    public Paciente paciente;  // Dato del nodo (un objeto Paciente)
    public NodoPaciente siguiente; //Referencia al siguiente nodo en la lista
    
    public NodoPaciente(Paciente paciente){
        
        this.paciente = paciente;
        this.siguiente = null; // Inicialmente no apunta a otro nodo
        
    }
    
}
