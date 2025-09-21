/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author sbong
 */
public class POO {

    public static void main(String[] args) {

        Empleado em1 = new Empleado(123, "Pepe", "Operario", 85000);
        Empleado em2 = new Empleado(124, "Fulano", "Ingeniero", 115000);
        Empleado em3 = new Empleado("Mengano", "Administrativo");
        Empleado em4 = new Empleado("Persiano", "Seguridad");

        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println(em4);        
        
        em1.actualizarSalario(10);
        em4.actualizarSalario(20000);
        
        System.out.println(em1);
        System.out.println(em4);
        
        System.out.println(Empleado.mostrarTotalEmpleados());
    }
    
}
