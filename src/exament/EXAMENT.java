/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exament;

import java.util.Scanner;

/**
 *
 * @author treiz
 */
public class EXAMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        ControladorPaciente controlador = new ControladorPaciente();
          int opcion;

        do {
            try {
                System.out.println("\n1. Agregar paciente");
                System.out.println("2. Listar pacientes");
                System.out.println("3. Salir");
                System.out.print("Opcion: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch(opcion) {
                    case 1:
                        System.out.print("Primer nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Tipo documento: ");
                        String tipoDoc = sc.nextLine();

                        System.out.print("Numero documento: ");
                        int numeroDoc = Integer.parseInt(sc.nextLine());

                        System.out.print("Fecha nacimiento: ");
                        String fecha = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        System.out.print("Telefono: ");
                        String telefono = sc.nextLine();

                        System.out.print("Alergias: ");
                        String alergias = sc.nextLine();

                        System.out.print("Tipo sangre: ");
                        String tipoSangre = sc.nextLine();

                        Paciente p = new Paciente(
                                nombre, tipoDoc, numeroDoc,
                                fecha, email, telefono,
                                alergias, tipoSangre
                        );

        
        
    }
    
}
