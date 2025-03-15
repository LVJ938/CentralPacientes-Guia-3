package Modelo;
/**
 *
 * @author Luis Vargas
 */
public class Paciente {
    
    private int id;
    private int edad;
    private String nombre;
    private String clinica;
    
    public Paciente (int id, int edad, String nombre, String clinica){
        this.id = id;
        this.edad = edad;
        this.nombre=nombre;
        this.clinica = clinica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }
    
  @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Clínica: " + clinica;
    }   
}
