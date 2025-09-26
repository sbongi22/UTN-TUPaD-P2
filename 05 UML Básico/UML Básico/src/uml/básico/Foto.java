/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public String getImagen() {
        return imagen;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void mostrar() {
        System.out.println("Foto: " + imagen + " - Formato: " + formato);
    }
}