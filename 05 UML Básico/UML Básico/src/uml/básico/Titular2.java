/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Titular2 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;
    
    public Titular2(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
    
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void mostrar() {
        System.out.println("Titular: " + nombre + " - DNI: " + dni);
        if (cuentaBancaria != null) {
            System.out.println("Cuenta: " + cuentaBancaria.getCbu());
        } else {
            System.out.println("Sin cuenta bancaria asignada.");
        }
    }
}