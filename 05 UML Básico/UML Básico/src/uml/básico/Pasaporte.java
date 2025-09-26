/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    // Composición: la Foto se crea dentro del Pasaporte
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getFechaEmision() {
        return fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    public void mostrar() {
        System.out.println("Pasaporte Nº: " + numero + " - Fecha: " + fechaEmision);
        if (foto != null) {
            System.out.println("Foto: " + foto.getImagen() + " - Formato: " + foto.getFormato());
        }
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre());
        } else {
            System.out.println("Sin titular asignado.");
        }
    }
}