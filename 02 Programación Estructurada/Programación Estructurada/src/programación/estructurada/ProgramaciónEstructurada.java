/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programación.estructurada;

import java.util.Scanner;

/**
 *
 * @author sbong
 */
public class ProgramaciónEstructurada {

     public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
             return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
     }
 
     public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
     }

     public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
     }
     
     public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
     }
     
static double descuentoEspecial = 0.10; // variable global

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
     }
    
    public static void imprimirRecursivo(double[] arr, int index) {
        if (index >= arr.length) return;
        System.out.println("Precio: $" + arr[index]);
        imprimirRecursivo(arr, index + 1);
    }
 
    public static void main(String[] args) {
        
//        // 1. Verificación de Año Bisiesto. 
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese un año: ");
//        int año = Integer.parseInt(input.nextLine());
//
//        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
//            System.out.println("El año " + año + " es bisiesto.");
//        } else {
//            System.out.println("El año " + año + " no es bisiesto.");
//        }
        
//        // 2. Determinar el Mayor de Tres Números. 
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el primer número: ");
//        int num1 = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese el segundo número: ");
//        int num2 = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese el tercer número: ");
//        int num3 = Integer.parseInt(input.nextLine());
//
//        int mayor;
//        
//        if (num1 >= num2 && num1 >= num3) {
//            mayor = num1;
//        } else if (num2 >= num1 && num2 >= num3) {
//            mayor = num2;
//        } else {
//            mayor = num3;
//        }
//
//        System.out.println("El número mayor es: " + mayor);
//    }

//        // 3. Clasificación de Edad
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese su edad: ");
//        int edad = Integer.parseInt(input.nextLine());
//
//        if (edad < 12) {
//            System.out.println("Niño.");
//        } else if (edad <= 17) {
//            System.out.println("Adolescente.");
//        } else if (edad <= 59) {
//            System.out.println("Adulto.");
//        } else {
//            System.out.println("Adulto mayor.");
//        }
//    }
          
//        // 4. Calculadora de Descuento según categoría. 
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese la categoría del producto (A, B o C): ");
//        char categoria = input.nextLine().charAt(0);
//
//        double descuento;
//        switch (categoria) {
//            case 'A' -> descuento = 0.10;
//            case 'B' -> descuento = 0.15;
//            case 'C' -> descuento = 0.20;
//            default -> {
//                System.out.println("Categoría no válida.");
//                return;
//            }
//        }
//
//        double precioFinal = precio * (1 - descuento);
//        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
//        System.out.println("Precio final: " + precioFinal);
//    }

//        // 5. Suma de Números Pares (while).  
//
//        Scanner input = new Scanner(System.in);
//        int num, suma = 0;
//
//        do {
//            System.out.print("Ingrese un número (0 para terminar): ");
//            num = Integer.parseInt(input.nextLine());
//            if (num % 2 == 0 && num != 0) {
//                suma += num;
//            }
//        } while (num != 0);
//
//        System.out.println("La suma de los números pares es: " + suma);
//    }

//          // 6. Contador de Positivos, Negativos y Ceros (for)
//
//        Scanner input = new Scanner(System.in);
//        int positivos = 0, negativos = 0, ceros = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Ingrese el número " + i + ": ");
//            int num = Integer.parseInt(input.nextLine());
//            if (num > 0) positivos++;
//            else if (num < 0) negativos++;
//            else ceros++;
//        }
//
//        System.out.println("Positivos: " + positivos);
//        System.out.println("Negativos: " + negativos);
//        System.out.println("Ceros: " + ceros);
//
//    }

//        // 7. Validación de Nota (do-while)
//
//        Scanner input = new Scanner(System.in);
//        int nota;
//
//        do {
//            System.out.print("Ingrese una nota (0-10): ");
//            nota = Integer.parseInt(input.nextLine());
//            if (nota < 0 || nota > 10) {
//                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
//            }
//        } while (nota < 0 || nota > 10);
//
//        System.out.println("Nota guardada correctamente.");
//    }
//

//        // 8. Cálculo del Precio Final con Impuesto y Descuento
//
//        //metodo escrito arriba
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el precio base del producto: ");
//        double precioBase = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
//        double impuesto = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese el descuento en porcentaje(Ejemplo: 5 para 5%): ");
//        double descuento = Double.parseDouble(input.nextLine());
//
//        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
//        System.out.println("El precio final del producto es: " + precioFinal);
//    }

//        // 9. Composición de Funciones para Envío y Total
//        
//        //metodo escrito arriba
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//        System.out.print("Ingrese el peso del paquete en kg: ");
//        double peso = Double.parseDouble(input.nextLine());
//        
//        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//        String zona = input.nextLine();
//
//        double envio = calcularCostoEnvio(peso, zona);
//        double total = calcularTotalCompra(precio, envio);
//
//        System.out.println("El costo de envío es: " + envio);
//        System.out.println("El total a pagar es: " + total);
//    }

//        // 10. Actualización de Stock
//
//        //metodo escrito arriba
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el stock actual del producto: ");
//        int stock = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese la cantidad vendida: ");
//        int vendida = Integer.parseInt(input.nextLine());
//        System.out.print("Ingrese la cantidad recibida: ");
//        int recibida = Integer.parseInt(input.nextLine());
//
//        int nuevoStock = actualizarStock(stock, vendida, recibida);
//        System.out.println("El nuevo stock del producto es: " + nuevoStock);
//    }

//        // 11. Descuento Especial con Variable Global
//
//        //metodo escrito arriba
//        Scanner input = new Scanner(System.in);
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(input.nextLine());
//        calcularDescuentoEspecial(precio);

//        // 12. Modificación de Array de Precios
//
//        double[] precios = {350.5, 270.5, 150.0, 400.0, 70.5};
//
//        System.out.println("Precios originales:");
//        for (double p : precios) {
//            System.out.println("Precio: $" + p);
//        }
//
//        precios[3] = 180.5; 
//
//        System.out.println("Precios modificados:");
//        for (double p : precios) {
//            System.out.println("Precio: $" + p);
//        }
//    }

//        // 13. Impresión Recursiva de Arrays
//        
//        //metodo escrito arriba
//        double[] precios = {350.5, 270.5, 150.0, 400.0, 70.5};
//
//        System.out.println("Precios originales:");
//        imprimirRecursivo(precios, 0);
//
//        precios[2] = 850.5;
//
//        System.out.println("Precios modificados:");
//        imprimirRecursivo(precios, 0);
//    }
    }
}
        
        
        
        
        
        
        
        
        
        

        
        
        
    
    

