package Vista;
/**
 *
 * @author Luis Vargas
 */

import java.util.Scanner;

public class ConsolaVista {
    private Scanner input;
    
    public ConsolaVista(){
        input = new Scanner(System.in); // indica que el Scanner toma los datos ingresados por consola
    }
    
    public int mostrarMenu(){
        System.out.println("\n---------------------------------");
        System.out.println("    Gestion de Pacientes ");
        System.out.println("---------------------------------");
        System.out.println("1. Agregar Paciente");
        System.out.println("2. Buscar Paciente");
        System.out.println("3. Eliminar Paciente");
        System.out.println("4. Mostrar los Pacientes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return input.nextInt(); // Retorna la opcion leida por teclado para que el controlador la procese.
    }
    
    // Metodos para pedir los datos del usuario cada dato se solicita en un método diferente para hacerlo mas flexible 
    
    public int pedirId(){
        System.out.println("Ingrese el numero de identificacion del paciente");
        input.nextLine();
        return input.nextInt();
    }
     public int pedirEdad(){
        System.out.println("Ingrese la edad del paciente");
        input.nextLine();
        return input.nextInt();
    }
     public String pedirNombre(){
        System.out.println("Ingrese el nombre del paciente");
        input.nextLine();
        return input.next();
    }
    public String pedirClinica(){
        System.out.println("Ingrese la clinica del paciente");
        input.nextLine();
        return input.next();
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
