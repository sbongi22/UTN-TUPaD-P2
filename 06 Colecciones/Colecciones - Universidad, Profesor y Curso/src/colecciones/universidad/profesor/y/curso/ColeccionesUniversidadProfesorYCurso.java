/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.universidad.profesor.y.curso;

/**
 *
 * @author sbong
 */
public class ColeccionesUniversidadProfesorYCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P001", "Martínez", "Programación");
        Profesor prof2 = new Profesor("P002", "Gómez", "Base de Datos");
        Profesor prof3 = new Profesor("P003", "Rodríguez", "Matemáticas");
        
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Base de Datos I");
        Curso curso4 = new Curso("C004", "Matemática");
        Curso curso5 = new Curso("C005", "Estructuras de Datos");
        
        // 2. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("=".repeat(50));
        
        // 3. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P001");
        
        System.out.println("=".repeat(50));
        
        // 4. Listar cursos con su profesor y profesores con sus cursos
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // Mostrar cursos por profesor
        System.out.println("CURSOS POR PROFESOR:");
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        System.out.println("=".repeat(50));
        
        // 5. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("CAMBIAR PROFESOR DE CURSO C005:");
        universidad.asignarProfesorACurso("C005", "P002");
        
        System.out.println("Después del cambio:");
        curso5.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();
        
        System.out.println("=".repeat(50));
        
        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("ELIMINAR CURSO C004:");
        universidad.eliminarCurso("C004");
        prof3.listarCursos();
        
        System.out.println("=".repeat(50));
        
        // 7. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("ELIMINAR PROFESOR P003:");
        universidad.eliminarProfesor("P003");
        universidad.listarProfesores();
        
        System.out.println("=".repeat(50));
        
        // 8. Mostrar reporte: cantidad de cursos por profesor
        universidad.mostrarReporteCursosPorProfesor();
    }
}
