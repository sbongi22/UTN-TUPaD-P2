/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getDuracionMin() {
        return duracionMin;
    }
    
    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }
    
    public void mostrar() {
        System.out.println("Proyecto: " + nombre + " - Duración: " + duracionMin + " min");
    }
    
    public double calcularTamanoEstimado() {
        return duracionMin * 100.0;
    }
}