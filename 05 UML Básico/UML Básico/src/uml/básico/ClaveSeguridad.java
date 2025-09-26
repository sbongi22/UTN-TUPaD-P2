/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    
    public void setCodigo(String nuevoCodigo, String fechaModificacion) {
        this.codigo = nuevoCodigo;
        this.ultimaModificacion = fechaModificacion;
    }
    
    public void mostrar() {
        System.out.println("Clave: " + codigo + " - Última modificación: " + ultimaModificacion);
    }
    
    public boolean verificarClave(String claveIngresada) {
        return this.codigo.equals(claveIngresada);
    }
}