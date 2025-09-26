/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class GeneradorQR {
    private String versionGenerador;
    
    public GeneradorQR(String versionGenerador) {
        this.versionGenerador = versionGenerador;
    }
    
    public void generar(String valor, Usuario3 usuario) {
        System.out.println("Versión: " + versionGenerador);
        
        CodigoQR qr = new CodigoQR(valor, usuario);  // Se crea aquí
        
        System.out.println("Código QR creado exitosamente");
        qr.mostrar();
    }
    
    public void mostrarInfo() {
        System.out.println("Generador QR: " + versionGenerador);
    }
    
}