/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.biblioteca.y.libros;

/**
 *
 * @author sbong
 */
public class ColeccionesBibliotecaYLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        Autor autor4 = new Autor("A004", "Mario Vargas Llosa", "Peruana");
        
        // 3. Agregar 5 libros asociados a autores
        biblioteca.agregarLibro("9788437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("9788478884458", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("9788401337208", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("9788466332401", "La ciudad y los perros", 1963, autor4);
        biblioteca.agregarLibro("9780307474728", "Crónica de una muerte anunciada", 1981, autor1);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 4. Listar todos los libros con su información y la del autor
        biblioteca.listarLibros();
        
        System.out.println("\n" + "=".repeat(50));
        
        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("BUSCAR LIBRO POR ISBN:");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("9788437604947");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }
        
        System.out.println("\n" + "=".repeat(50));
        
        // 6. Filtrar y mostrar los libros publicados en un año específico
        biblioteca.filtrarLibrosPorAnio(1982);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("ELIMINAR LIBRO:");
        biblioteca.eliminarLibro("9788478884458");
        biblioteca.listarLibros();
        
        System.out.println("\n" + "=".repeat(50));
        
        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("CANTIDAD TOTAL DE LIBROS: " + biblioteca.obtenerCantidadLibros());
        
        System.out.println("\n" + "=".repeat(50));
        
        // 9. Listar todos los autores de los libros disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
    
}
