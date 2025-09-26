/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Calculadora {
    private String tipoCalculadora;
    
    public Calculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public void calcular(Impuesto impuesto) {
        System.out.println("Impuesto base: $" + impuesto.getMonto());
        
        double iva = impuesto.getMonto() * 0.21;
        double total = impuesto.getMonto() + iva;
        
        System.out.println("IVA (21%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        
        if (impuesto.getContribuyente() != null) {
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        }
    }
    
    public void calcularInteres(Impuesto impuesto, int dias, double tasa) {
        double interes = impuesto.calcularInteresMora(dias, tasa);
        System.out.println("Interés por " + dias + " días de mora: $" + interes);
        System.out.println("Nuevo total: $" + (impuesto.getMonto() + interes));
    }
    
    public void mostrarInfo() {
        System.out.println("Calculadora: " + tipoCalculadora);
    }
}