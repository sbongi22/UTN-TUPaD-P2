/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author sbong
 */
public class Principal {
    public static void main(String[] args) {
        
        //Parte 2: Ejercicios sobre Excepciones  

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        

        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        

        ValidadorEdad validador = new ValidadorEdad();
        int[] edades = {25, -5, 150, 30};
        
        for (int edad : edades) {
            try {
                validador.validarEdad(edad);
            } catch (EdadInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    
}
