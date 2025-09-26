/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario2 usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario); 
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        if (firmaDigital != null) {
            firmaDigital.mostrar();
        } else {
            System.out.println("Documento sin firma.");
        }
    }
    
    public boolean verificarIntegridad() {
        if (firmaDigital == null) {
            return false;
        }
        String hashCalculado = "hash_" + titulo + contenido;
        return firmaDigital.verificarFirma(hashCalculado);
    }
}