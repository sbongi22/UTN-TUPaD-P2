/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Reproductor {
    private String nombreReproductor;
    
    public Reproductor(String nombreReproductor) {
        this.nombreReproductor = nombreReproductor;
    }
    
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo en: " + nombreReproductor + ": " + cancion.getInfoCompleta());
    }
    
    public void pausar(Cancion cancion) {
        System.out.println("Pausando: " + cancion.getTitulo());
    }
    
    public void mostrarInfo() {
        System.out.println("Reproductor: " + nombreReproductor);
    }
}
