/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.sistema.de.stock;

import java.util.ArrayList;

/**
 *
 * @author sbong
 */

public class Inventario {
    private final ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("LISTA DE PRODUCTOS");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto.getNombre());
            return true;
        }
        System.out.println("No se encontró producto con ID: " + id);
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + producto.getNombre() + ": " + nuevaCantidad);
            return true;
        }
        System.out.println("No se encontró producto con ID: " + id);
        return false;
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("PRODUCTOS DE CATEGORÍA: " + categoria + "");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría: " + categoria);
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("PRODUCTOS ENTRE $" + min + " Y $" + max + "");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("CATEGORÍAS DISPONIBLES");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria + ": " + categoria.getDescripcion());
        }
    }
}