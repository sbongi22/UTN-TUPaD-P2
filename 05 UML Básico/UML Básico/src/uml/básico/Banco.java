/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCuit() {
        return cuit;
    }
    
    public void mostrar() {
        System.out.println("Banco: " + nombre + " / CUIT: " + cuit);
    }
}