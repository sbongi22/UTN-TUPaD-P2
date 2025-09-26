/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void mostrar() {
        System.out.println("Impuesto: $" + monto);
        if (contribuyente != null) {
            contribuyente.mostrar();
        }
    }

    public double calcularInteresMora(int diasMora, double tasaDiaria) {
        return monto * tasaDiaria * diasMora;
    }
}
