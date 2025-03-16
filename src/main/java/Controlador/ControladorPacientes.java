package Controlador;
/**
 *
 * @author LuisVargas
 */
import Modelo.*;
import Vista.ConsolaVista;

public class ControladorPacientes {
    private ListaPacientes listaP;
    private ConsolaVista consola;
    
    public ControladorPacientes(ListaPacientes listaP, ConsolaVista consola){
        this.listaP = listaP;
        this.consola = consola;
    }
    
    public void start(){
        boolean salir = false; // Variable de control para el bucle
        while (!salir){
            int opcion = consola.mostrarMenu();
            switch (opcion){
                case 1:
                   addPaciente();
                   break;
               case 2:
                   findPaciente();
                   break;
               case 3:
                   delPaciente();
                   break;
               case 4:
                   listaP.mostrarPacientes();
                   break;
               case 5:
                    salir = true;
                    consola.mostrarMensaje("Saliendo del sistema...");
                    break;
               default:
                    consola.mostrarMensaje("Opción no válida.");
            }
        }
    }
    
    private void addPaciente() {
        int id = consola.pedirId();
        int edad = consola.pedirEdad();
        String nombre = consola.pedirNombre();
        String clinica = consola.pedirClinica();
        listaP.agregarPaciente(new Paciente(id,edad,nombre,clinica));
        consola.mostrarMensaje("\nPaciente agregado correctamente.");
    }
    
   private void findPaciente(){
       int id = consola.pedirId();
       Paciente paciente = listaP.buscarPaciente(id);
       if (paciente !=null){
           consola.mostrarMensaje("\nPaciente encontrado: ");
           System.out.println("\n=========================================");
System.out.println("            PACIENTE        ");
System.out.println("=========================================");
           System.out.printf("%-10s %-15s %-5s %-20s%n", "ID", "Nombre", "Edad", "Clinica");
           consola.mostrarMensaje(""+paciente);
       }
       else{
           consola.mostrarMensaje("\nEl paciente no esta registrado");
       }
   }
   
   private void delPaciente(){
       int id = consola.pedirId();
       boolean eliminado = listaP.borrarPaciente(id);
       if (eliminado){
           consola.mostrarMensaje("El paciente fue eliminado correctamente");
       }
       else{
           consola.mostrarMensaje("\nNo hay pacientes con esa identificacion");
       }
   }
}
