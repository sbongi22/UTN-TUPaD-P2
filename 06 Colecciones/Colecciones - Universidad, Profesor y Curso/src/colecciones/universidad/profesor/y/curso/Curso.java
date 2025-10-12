/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.universidad.profesor.y.curso;

/**
 *
 * @author sbong
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }
        
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = p;
        
        if (p != null) {
            p.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("-----------------------------------");
    }
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
}