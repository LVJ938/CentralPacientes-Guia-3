package Modelo;
/**
 *
 * @author Luis Vargas
 */
public class ListaPacientes {
    
    private NodoPaciente cabeza;
    
    public ListaPacientes(){
        this.cabeza = null;
    }
    
    //Agregar Paciente a la lista enlazada
    public void agregarPaciente(Paciente paciente){
        NodoPaciente nuevoP = new NodoPaciente(paciente);
        if (cabeza == null){
            cabeza = nuevoP; //Si la lista está vacía, el nuevo nodo es el primero
        }
        else{
            NodoPaciente actual = cabeza;
            while(actual.siguiente !=null ){
                actual = actual.siguiente; // Se recorre hasta el último nodo hasta encontrar uno vacio
            }
            actual.siguiente = nuevoP; // Se agraega el nuevo nodo al final
        }
    }
    
    // Buscar paciente por ID
    public Paciente buscarPaciente(int id){
        NodoPaciente actual = cabeza;
        while (actual != null){
            if (actual.paciente.getId() == id){ // Compara el ID con el ID del nodo actual
                return actual.paciente;
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        //System.out.println("Paciente no encontrado.");
        return null; // Retorna null si no se encuentra el paciente
    }
    
    // Eliminar paciente por ID
    public boolean borrarPaciente(int id){
      if(cabeza == null){
          return false; // Si la lista está vacía, no hay nada que eliminar
      }
      if(cabeza.paciente.getId()==id){
          cabeza = cabeza.siguiente; // Si el paciente que se elimina es el primero, la cabeza avanza de posisicion
          return true;
      }
      NodoPaciente actual = cabeza;
      while(actual.siguiente !=null){
          if(actual.siguiente.paciente.getId() == id){
              actual.siguiente = actual.siguiente.siguiente; // Se salta el nodo que se quiere  eliminar (Cabeza → [Nodo A] → [Nodo B] → [Nodo C] → [Nodo D] → null)   (Cabeza → [Nodo A] ------> [Nodo C] → [Nodo D] → null)  
              return true;
          }
          actual = actual.siguiente;
      }
      return false;
    }
    
    // Mostrar todos los pacientes
    public void mostrarPacientes(){
        NodoPaciente actual = cabeza;
        if (actual == null){
            System.out.println("\nNo hay pasientes registrados");
            return;
        }
        System.out.println("=============================================");
        System.out.println("        LISTA DE PACIENTES          ");
        System.out.println("=============================================");
        System.out.printf("%-10s %-15s %-5s %-20s%n", "ID", "Nombre", "Edad", "Clinica");
        System.out.println("--------------------------------------------");
        while (actual != null){
            System.out.printf("%-10d %-15s %-5d %-20s%n", 
                          actual.paciente.getId(), 
                          actual.paciente.getNombre(), 
                          actual.paciente.getEdad(), 
                          actual.paciente.getClinica());
            //System.out.print(actual.paciente);
            actual = actual.siguiente;
        }
        System.out.println("=============================================");
    }
    
}
