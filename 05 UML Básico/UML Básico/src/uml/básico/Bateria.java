/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Bateria {
    private String modelo;
    private int capacidad; // en mAh
    
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void mostrar() {
        System.out.println("Batería: " + modelo + " / " + capacidad + "mAh");
    }
}
