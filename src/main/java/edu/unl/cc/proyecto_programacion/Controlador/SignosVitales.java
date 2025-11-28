/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author Usuario iTC
 */
public class SignosVitales {
    private double peso;
    private double altura;
    private int frecuenciaCardiaca;
    private String presionArterial;
    private int frecuenciaRespiratoria;
    private double temperatura;
    private int saturacionOxigeno;

    public SignosVitales(double peso, double altura, int frecuenciaCardiaca, String presionArterial, int frecuenciaRespiratoria, double temperatura, int saturacionOxigeno) {
        this.peso = peso;
        this.altura = altura;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionArterial = presionArterial;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
    }
    
    public SignosVitales() {}

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(int saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    @Override
    public String toString() {
        return "SignosVitales{" + "peso=" + peso + ", altura=" + altura + ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", presionArterial=" + presionArterial + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperatura=" + temperatura + ", saturacionOxigeno=" + saturacionOxigeno + '}';
    }

    
}
