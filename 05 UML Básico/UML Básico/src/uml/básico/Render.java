/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Render {
    private String formato;
    private Proyecto proyecto; 
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public void mostrar() {
        System.out.println("Render: Formato " + formato);
        if (proyecto != null) {
            proyecto.mostrar();
        }
    }
    
    public void simularRenderizado() {
        System.out.println("Renderizando " + proyecto.getNombre() + " en formato " + formato + "...");
        int tiempoEstimado = proyecto.getDuracionMin() * 2;
        System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
    }
}