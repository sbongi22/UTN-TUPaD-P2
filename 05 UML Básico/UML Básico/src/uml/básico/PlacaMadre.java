/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public void mostrar() {
        System.out.println("Placa Madre: " + modelo + " / Chipset: " + chipset);
    }
}
