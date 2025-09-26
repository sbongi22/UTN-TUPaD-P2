/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Mesa {
    private int numero;
    private int capacidad;
    
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void mostrar() {
        System.out.println("Mesa Nº: " + numero + " / Capacidad: " + capacidad + " personas");
    }
}