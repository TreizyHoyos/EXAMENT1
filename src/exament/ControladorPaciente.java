/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament;

import java.util.ArrayList;

/**
 *
 * @author treiz
 */
public class ControladorPaciente {
    
    private ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
    }
    public void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente p : listaPacientes) {
                System.out.println("-------------------");
                System.out.println("Nombre: " + p.getPrimer_nombre());
                System.out.println("Documento: " + p.getNumero_documento());
                System.out.println("Email: " + p.getEmail());
                System.out.println("Tipo sangre: " + p.getTipo_sangre());
            }
        }
    }

   
}
