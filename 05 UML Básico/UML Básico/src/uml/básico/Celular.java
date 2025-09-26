/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación bidireccional
    
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Batería existe independientemente (Agregación)
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public String getImei() {
        return imei;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    public void mostrar() {
        System.out.println("Celular: " + marca + " " + modelo + " - IMEI: " + imei);
        if (bateria != null) {
            bateria.mostrar();
        }
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre());
        } else {
            System.out.println("Sin usuario asignado.");
        }
    }
}