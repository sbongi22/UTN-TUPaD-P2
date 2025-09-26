/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario; 
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    public void mostrar() {
        System.out.println("Marca: " + marca + " / Nº Serie: " + numeroSerie);
        if (placaMadre != null) {
            placaMadre.mostrar();
        }
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre());
        } else {
            System.out.println("Sin propietario asignado.");
        }
    }
}