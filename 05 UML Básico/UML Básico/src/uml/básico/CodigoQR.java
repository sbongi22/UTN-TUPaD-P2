/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class CodigoQR {
    private String valor;
    private Usuario3 usuario;
    
    public CodigoQR(String valor, Usuario3 usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() {
        return valor;
    }
    
    public Usuario3 getUsuario() {
        return usuario;
    }
    
    public void mostrar() {
        System.out.println("Código QR: " + valor);
        if (usuario != null) {
            usuario.mostrar();
        }
    }

    public boolean esValido() {
        return valor != null && !valor.trim().isEmpty();
    }
}