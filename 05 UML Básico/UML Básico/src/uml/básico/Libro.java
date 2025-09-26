/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;        
    private Editorial editorial; 
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void mostrar() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("ISBN: " + isbn);
        if (autor != null) {
            autor.mostrar();
        }
        if (editorial != null) {
            editorial.mostrar();
        }
    }
}