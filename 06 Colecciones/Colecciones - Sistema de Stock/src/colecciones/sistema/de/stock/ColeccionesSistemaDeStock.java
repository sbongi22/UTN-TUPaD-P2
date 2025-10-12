/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.sistema.de.stock;

/**
 *
 * @author sbong
 */
public class ColeccionesSistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        
        // 1. Crear al menos cinco productos con diferentes categorías
        Producto p1 = new Producto("A001", "Arroz", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E001", "Smartphone", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R001", "Camisa", 1200, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H001", "Sartén", 1500, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A002", "Leche", 500, 40, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("E002", "Auriculares", 2000, 25, CategoriaProducto.ELECTRONICA);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 2. Listar todos los productos
        inventario.listarProductos();
        
        System.out.println("\n" + "=".repeat(50));
        
        // 3. Buscar un producto por ID
        System.out.println("BUSCAR PRODUCTO POR ID:");
        Producto encontrado = inventario.buscarProductoPorId("E001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        
        System.out.println("\n" + "=".repeat(50));
        
        // 4. Filtrar productos por categoría específica
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 5. Eliminar un producto por ID
        System.out.println("ELIMINAR PRODUCTO:");
        inventario.eliminarProducto("R001");
        inventario.listarProductos();
        
        System.out.println("\n" + "=".repeat(50));
        
        // 6. Actualizar stock de un producto
        System.out.println("ACTUALIZAR STOCK:");
        inventario.actualizarStock("A001", 75);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 7. Mostrar el total de stock disponible
        System.out.println("TOTAL DE STOCK: " + inventario.obtenerTotalStock());
        
        System.out.println("\n" + "=".repeat(50));
        
        // 8. Obtener y mostrar el producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("PRODUCTO CON MAYOR STOCK:");
            mayorStock.mostrarInfo();
        }
        
        System.out.println("\n" + "=".repeat(50));
        
        // 9. Filtrar productos con precios entre $1000 y $3000
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 10. Mostrar las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
    
    }
    
}
