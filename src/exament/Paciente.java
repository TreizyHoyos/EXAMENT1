/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament;

/**
 *
 * @author treiz
 */
public class Paciente {
    
    private String primer_nombre;
    private String tipo_documento;
    private int numero_documento;
    private String fecha_nacimiento;
    private String email;
    private String telefono;
    private String alergias;
    private String tipo_sangre;

    public Paciente(String primer_nombre, String tipo_documento, int numero_documento,
                    String fecha_nacimiento, String email, String telefono,
                    String alergias, String tipo_sangre) {

        this.primer_nombre = primer_nombre;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.alergias = alergias;
        this.tipo_sangre = tipo_sangre;
    }
    
}
