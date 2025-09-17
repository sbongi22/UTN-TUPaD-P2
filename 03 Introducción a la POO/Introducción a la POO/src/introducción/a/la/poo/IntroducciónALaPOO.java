/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducción.a.la.poo;

/**
 *
 * @author sbong
 */
public class IntroducciónALaPOO {


    public static void main(String[] args) {

// 1. Registro de Estudiantes 


        Estudiante es = new Estudiante();
        
        es.setNombre("Pepe");
        es.setApellido("Piazzola");
        es.setCurso("Historia");
        es.setCalificacion(7);
        
        es.mostrarInfo();
        es.subirCalificacion(2.0);
        es.bajarCalificacion(4.0);
        

// 2. Registro de Mascotas 

        Mascota mc = new Mascota();
        
        mc.setNombre("Timmy");
        mc.setEspecie("Caniche");
        mc.setEdad(5);
        
        mc.mostrarInfo();
        mc.cumplirAnios();


// 3. Encapsulamiento con la Clase Libro 

        Libro lb = new Libro();
        
        lb.setAutor("Gabriel García Márquez");
        lb.setTitulo("Cien Años de Soledad");
        lb.setAñoPublicacion(2035);
       
        
// 4. Gestión de Gallinas en Granja Digital 

        Gallina gl1 = new Gallina();
        Gallina gl2 = new Gallina();

        gl1.setIdGallina(45);
        gl1.setEdad(2);
        gl1.setHuevosPuestos(15);
            
        gl2.setIdGallina(84);        
        gl2.setEdad(3);        
        gl2.setHuevosPuestos(8);
        
        gl1.mostrarEstado();
        gl2.mostrarEstado();
        
        gl1.envejecer();
        gl2.envejecer();


// 5. Simulación de Nave Espacial 

        NaveEspacial nave = new NaveEspacial();
        
        nave.setNombre("Spontini");
        nave.setCombustible(50);
        nave.mostrarEstado();
        
        nave.despegar();
        nave.avanzar(100);
        
        nave.recargarCombustible(60);
        
        nave.avanzar(50);
        nave.mostrarEstado();

    }    
}
