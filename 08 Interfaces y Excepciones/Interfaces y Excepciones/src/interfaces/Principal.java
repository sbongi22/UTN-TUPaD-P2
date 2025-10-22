/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author sbong
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Parte 1: Interfaces en un sistema de E-commerce  
        
        Cliente cliente = new Cliente("Homero Simpson", "hsimpson@gmail.com");
        
        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        Producto producto3 = new Producto("Teclado", 50.0);
        
        System.out.println("- " + producto1.getNombre() + ": $" + producto1.getPrecio());
        System.out.println("- " + producto2.getNombre() + ": $" + producto2.getPrecio());
        System.out.println("- " + producto3.getNombre() + ": $" + producto3.getPrecio());
        
        System.out.println("Creando Pedido");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        System.out.println("Procesando Pago");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Homero Simpson");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        System.out.println("Total con descuento: $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);
        
        pedido.cambiarEstado("PROCESANDO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
        
        
    }
}
        //Parte 2: Ejercicios sobre Excepciones  

