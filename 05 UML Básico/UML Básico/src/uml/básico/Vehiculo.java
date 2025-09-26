/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; 
    private Conductor conductor; 
    
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    public Conductor getConductor() {
        return conductor;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void mostrar() {
        System.out.println("Patente: " + patente + " / Modelo: " + modelo);
        if (motor != null) {
            motor.mostrar();
        }
        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre());
        } else {
            System.out.println("Sin conductor asignado.");
        }
    }
    
    public void cambiarMotor(Motor nuevoMotor) {
        this.motor = nuevoMotor;
        System.out.println("Motor cambiado exitosamente.");
    }
}