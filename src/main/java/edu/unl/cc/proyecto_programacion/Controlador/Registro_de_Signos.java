/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;
import java.time.LocalDateTime;


/**
 *
 * @author David-NNFG, camilachim, Etxhn
 */
public class Registro_de_Signos {
    
    private Paciente paciente;
    private SignosVitales signosVitales;
    private LocalDateTime fechaHora;

    public Registro_de_Signos(Paciente paciente, SignosVitales signosVitales) {

        if (paciente == null) {
            throw new IllegalArgumentException("Paciente no puede ser nulo");
        }

        if (signosVitales == null) {
            throw new IllegalArgumentException("Signos vitales no pueden ser nulos");
        }

        this.paciente = paciente;
        this.signosVitales = signosVitales;
        this.fechaHora = LocalDateTime.now();
    }

    public Registro_de_Signos() {
        this.fechaHora = LocalDateTime.now();
    }

    public Paciente getPaciente() { return paciente; }
    public SignosVitales getSignosVitales() { return signosVitales; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) throw new IllegalArgumentException("Paciente no puede ser nulo");
        this.paciente = paciente;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        if (signosVitales == null) throw new IllegalArgumentException("Signos vitales no pueden ser nulos");
        this.signosVitales = signosVitales;
    }

    @Override
    public String toString() {
        return "Registro_de_Signos{" +
                "paciente=" + paciente.toString() +
                ", signosVitales=" + signosVitales.toString() +
                ", fechaHora=" + fechaHora +
                '}';
    }
}

