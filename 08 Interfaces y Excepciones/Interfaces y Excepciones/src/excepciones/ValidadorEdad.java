/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author sbong
 */
public class ValidadorEdad {
    public void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }
    
    public static void main(String[] args) {
        ValidadorEdad validador = new ValidadorEdad();
        int[] edades = {25, -5, 150, 30};
        
        for (int edad : edades) {
            try {
                validador.validarEdad(edad);
            } catch (EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}