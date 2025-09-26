/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente2 cliente;
    private Mesa mesa;
    
    public Reserva(String fecha, String hora, Cliente2 cliente2, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    
    public Cliente2 getCliente() {
        return cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void mostrar() {
        System.out.println("Fecha: " + fecha + " - Hora: " + hora);
        if (cliente != null) {
            cliente.mostrar();
        }
        if (mesa != null) {
            mesa.mostrar();
        }
    }
    
    public void cancelarReserva() {
        this.mesa = null;
        System.out.println("Reserva cancelada. Mesa liberada.");
    }
}
