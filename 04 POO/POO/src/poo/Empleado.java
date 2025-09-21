/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author sbong
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    //constructor para empleado asignando valores
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }    
    
    //constructor para empleado con id automatico y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 100;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 80000;
        totalEmpleados++;
    }    
    
    //metodo por porcentaje
    public void actualizarSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;   
    }
    
    //metodo por cantidad fija    
    public void actualizarSalario(double aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        
}
