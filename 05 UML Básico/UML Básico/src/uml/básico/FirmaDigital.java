/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario2 usuario;
    
    public FirmaDigital(String codigoHash, String fecha, Usuario2 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; 
    }
    
    public Usuario2 getUsuario() {
        return usuario;
    }
    
    public String getCodigoHash() {
        return codigoHash;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void mostrar() {
        System.out.println("Firma Digital: " + codigoHash + " - Fecha: " + fecha);
        if (usuario != null) {
            usuario.mostrar();
        }
    }

    public boolean verificarFirma(String hashAComparar) {
        return this.codigoHash.equals(hashAComparar);
    }
}