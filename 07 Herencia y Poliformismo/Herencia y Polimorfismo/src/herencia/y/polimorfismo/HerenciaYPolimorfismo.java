/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia.y.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sbong
 */
public class HerenciaYPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // 1. Vehículos y herencia básica  
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo(); 
        
        System.out.println("---------------------------");
    
        // 2. Figuras geométricas y métodos abstractos  
        Figura[] figuras = {
            new Circulo("Círculo A", 5.0),
            new Rectangulo("Rectángulo B", 4.0, 6.0)
        };

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
        
        System.out.println("---------------------------");        
        
        // 3. Empleados y polimorfismo    
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 300000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 160000));

        for (Empleado emp : empleados) {
            System.out.println(emp.nombre + " - Sueldo: $" + emp.calcularSueldo());
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
        }

        System.out.println("---------------------------");        
        
        // 4. Animales y comportamiento sobrescrito  
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Garfield"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.describirAnimal();
        }
            
    }
    
}
