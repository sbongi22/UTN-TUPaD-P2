/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void mostrar() {
        System.out.println("Fecha: " + fecha + " - Hora: " + hora);
        if (paciente != null) {
            paciente.mostrar();
        }
        if (profesional != null) {
            profesional.mostrar();
        }
    }
    
    public void reprogramar(String nuevaFecha, String nuevaHora) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        System.out.println("Cita reprogramada para: " + nuevaFecha + " " + nuevaHora);
    }
    
    public void cancelar() {
        this.paciente = null;
        this.profesional = null;
        System.out.println("Cita cancelada.");
    }
}
