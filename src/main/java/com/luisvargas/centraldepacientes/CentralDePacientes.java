package com.luisvargas.centraldepacientes;
/**
 *
 * @author Luis Vatgas
 */
import Modelo.*;
import Vista.ConsolaVista;
import Controlador.ControladorPacientes;
public class CentralDePacientes {

    public static void main(String[] args) {
        ListaPacientes listaP = new ListaPacientes();
        ConsolaVista consola = new ConsolaVista();
        ControladorPacientes controlP = new ControladorPacientes(listaP, consola);
        
        controlP.start();
    }
}
