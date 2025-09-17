/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducción.a.la.poo;

/**
 *
 * @author sbong
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= 100) {
            this.combustible = combustible;
        } else {
            System.out.println("Combustible fuera de rango válido (0 a 100).");
        }
    }    
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("Haz despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("Avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Combustible recargado a " + combustible);
        } else {
            System.out.println("No se puede recargar, excede el límite máximo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + 100);
    }
}    
    
    
    

