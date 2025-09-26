/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public void mostrar() {
        System.out.println("Motor: " + tipo + " / Nº Serie: " + numeroSerie);
    }
}