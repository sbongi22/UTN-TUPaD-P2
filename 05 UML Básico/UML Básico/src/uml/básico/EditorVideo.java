/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class EditorVideo {
    private String versionEditor;
    
    public EditorVideo(String versionEditor) {
        this.versionEditor = versionEditor;
    }
    
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("Editor: " + versionEditor);
        System.out.println("Proyecto: " + proyecto.getNombre());
        
        Render render = new Render(formato, proyecto);
        
        System.out.println("Render creado para formato: " + formato);
        render.mostrar();
        render.simularRenderizado();
        
        double tamano = proyecto.calcularTamanoEstimado();
        System.out.println("Tamaño estimado: " + tamano + " MB");
    }
    
    public void exportarMultipleFormatos(String[] formatos, Proyecto proyecto) {
        for (String formato : formatos) {
            Render renderTemp = new Render(formato, proyecto);
            System.out.println("Exportando a " + formato + ": " + renderTemp.getProyecto().getNombre());
        }
        System.out.println(formatos.length + " formatos exportados");
    }
    
    public void previsualizar(Proyecto proyecto) {
        System.out.println("Previsualizando: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
    }
    
    public void mostrarInfo() {
        System.out.println("Editor de Video: " + versionEditor);
    }
}