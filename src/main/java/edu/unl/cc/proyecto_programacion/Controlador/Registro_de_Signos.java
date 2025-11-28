/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;
import java.time.LocalDateTime;


/**
 *
 * @author DAVID-NNFG
 */
public class Registro_de_Signos {
    
    private Paciente paciente; //Se registra el pasiente desde la clase "Pasiente" 
    private SignosVitales signosVitales; // Se registra los signos vitales 
    private LocalDateTime fechaHora; // Se registra la fecha y hora 

    public Registro_de_Signos(Paciente paciente, SignosVitales signosVitales, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.signosVitales = signosVitales;
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public SignosVitales getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        this.signosVitales = signosVitales;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro_de_Signos{");
        sb.append("paciente=").append(paciente);
        sb.append(", signosVitales=").append(signosVitales);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append('}');
        return sb.toString();
    }
}
