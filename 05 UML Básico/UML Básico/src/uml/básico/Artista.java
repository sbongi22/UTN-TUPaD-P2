/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Artista {
    private String nombre;
    private String genero;
    
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void mostrar() {
        System.out.println("Artista: " + nombre + " / Género: " + genero);
    }
}