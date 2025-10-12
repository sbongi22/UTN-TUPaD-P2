/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.universidad.profesor.y.curso;

/**
 *
 * @author sbong
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }
    
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            return true;
        }
        return false;
    }
    
    public void listarProfesores() {
        System.out.println("PROFESORES DE LA UNIVERSIDAD");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("CURSOS DE LA UNIVERSIDAD");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            return true;
        }
        return false;
    }
    
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            return true;
        }
        return false;
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("REPORTE: CURSOS POR PROFESOR");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}