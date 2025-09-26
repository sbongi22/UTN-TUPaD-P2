/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Paciente {
    private String nombre;
    private String obraSocial;
    
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getObraSocial() {
        return obraSocial;
    }
    
    public void mostrar() {
        System.out.println("Paciente: " + nombre + " - Obra Social: " + obraSocial);
    }
}