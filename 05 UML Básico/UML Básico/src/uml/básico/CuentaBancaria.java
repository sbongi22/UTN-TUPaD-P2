/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular2 titular;
    
    public CuentaBancaria(String cbu, double saldoInicial, String clave, String fechaCreacion) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(clave, fechaCreacion);
    }
    
    public void setTitular(Titular2 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public Titular2 getTitular() {
        return titular;
    }
    
    public String getCbu() {
        return cbu;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
    
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto inválido.");
        }
    }
    
    public boolean retirar(double monto, String claveIngresada) {
        if (claveSeguridad.verificarClave(claveIngresada)) {
            if (monto > 0 && monto <= saldo) {
                this.saldo -= monto;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                return true;
            } else {
                System.out.println("Monto inválido o saldo insuficiente.");
                return false;
            }
        } else {
            System.out.println("Clave incorrecta.");
            return false;
        }
    }
    
    public void cambiarClave(String claveActual, String nuevaClave, String fecha) {
        if (claveSeguridad.verificarClave(claveActual)) {
            claveSeguridad.setCodigo(nuevaClave, fecha);
            System.out.println("Clave cambiada exitosamente.");
        } else {
            System.out.println("Clave actual incorrecta.");
        }
    }
    
    public void mostrar() {
        System.out.println("CBU: " + cbu + " - Saldo: $" + saldo);
        if (claveSeguridad != null) {
            claveSeguridad.mostrar();
        }
        if (titular != null) {
            titular.mostrar();
        }
    }
}