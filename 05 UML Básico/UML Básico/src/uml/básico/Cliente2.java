/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Cliente2 {
    private String nombre;
    private String telefono;
    
    public Cliente2(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void mostrar() {
        System.out.println("Cliente: " + nombre + " - Tel: " + telefono);
    }
}
