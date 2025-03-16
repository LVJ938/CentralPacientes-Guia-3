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
        System.out.print("\nSeleccione una opción: ");
        return input.nextInt(); // Retorna la opcion leida por teclado para que el controlador la procese.
    }
    
    // Metodos para pedir los datos del usuario cada dato se solicita en un método diferente para hacerlo mas flexible 
    
    public int pedirId(){
        System.out.println("\nIngrese el numero de identificacion del paciente");
        int id = input.nextInt();
        input.nextLine(); // Limpiar el buffer después de nextInt()
        return id;
    }
     public int pedirEdad(){
        System.out.println("Ingrese la edad del paciente");
        int edad = input.nextInt();
        input.nextLine();
        return edad;
    }
     public String pedirNombre(){
        System.out.println("Ingrese el nombre del paciente");
        return input.nextLine();
    }
    public String pedirClinica(){
        System.out.println("Ingrese la clinica del paciente");
        return input.nextLine();
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
      public static String getEncabezado() {
        return String.format("%-10s %-20s %-5s %-20s", "ID", "Nombre", "Edad", "Clínica");
    }
}
