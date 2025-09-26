/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void mostrar() {
        System.out.println("Propietario: " + nombre + " / DNI: " + dni);
        if (computadora != null) {
            System.out.println("Computadora: " + computadora.getMarca() + " " + computadora.getNumeroSerie());
        } else {
            System.out.println("No tiene computadora asignada.");
        }
    }
}