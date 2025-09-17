/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducción.a.la.poo;

/**
 *
 * @author sbong
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre(){
        return nombre;        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;        
    }    
    
    public String getApellido(){
        return apellido;        
    }    
    
    public void setApellido(String apellido){
        this.apellido = apellido;        
    }     
    
    public String getCurso(){
        return curso;        
    }
    
    public void setCurso(String curso){
        this.curso = curso;        
    }     
    
    public double getCalificacion(){
        return calificacion;        
    }
    
    public void setCalificacion(double calificacion){
        if (calificacion >= 0 & calificacion <= 10){ 
        this.calificacion = calificacion;}        
    }
    
    //metodos
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada a: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificación reducida a: " + calificacion);
    }
}

