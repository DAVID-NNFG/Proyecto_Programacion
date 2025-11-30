/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author David-NNFG, camilachim, Etxhn
 */
public class SignosVitales {
    
   private double peso;
    private double altura;
    private int frecuenciaCardiaca;
    private double presionArterial; 
    private int frecuenciaRespiratoria;
    private double temperatura;
    private int saturacionOxigeno;

    public SignosVitales(double altura, double peso, double frecuenciaCardiaca,
                         double presionArterial, double saturacionOxigeno) {
        setAltura(altura);
        setPeso(peso);
        setFrecuenciaCardiaca((int) frecuenciaCardiaca);
        setPresionArterial(presionArterial);
        setSaturacionOxigeno((int) saturacionOxigeno);

        this.frecuenciaRespiratoria = 0;
        this.temperatura = 0;
    }

    public SignosVitales(double peso, double altura, int frecuenciaCardiaca, 
                         double presionArterial, int frecuenciaRespiratoria,
                         double temperatura, int saturacionOxigeno) {

        setPeso(peso);
        setAltura(altura);
        setFrecuenciaCardiaca(frecuenciaCardiaca);
        setPresionArterial(presionArterial);
        setFrecuenciaRespiratoria(frecuenciaRespiratoria);
        setTemperatura(temperatura);
        setSaturacionOxigeno(saturacionOxigeno);
    }

    public SignosVitales() {}


    public void setPeso(double peso) {
        if (peso < 1 || peso > 500) {
            throw new IllegalArgumentException("Peso no válido (1 - 500 kg)");
        }
        this.peso = peso;
    }

    public void setAltura(double altura) {
        if (altura < 0.30 || altura > 2.50) {
            throw new IllegalArgumentException("Altura no válida (0.30 - 2.50 m)");
        }
        this.altura = altura;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        if (frecuenciaCardiaca < 20 || frecuenciaCardiaca > 220) {
            throw new IllegalArgumentException("Frecuencia cardíaca no válida (20-220)");
        }
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public void setPresionArterial(double presionArterial) {
        if (presionArterial < 40 || presionArterial > 200) {
            throw new IllegalArgumentException("Presión arterial no válida (40-200)");
        }
        this.presionArterial = presionArterial;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setSaturacionOxigeno(int saturacionOxigeno) {
        if (saturacionOxigeno < 0 || saturacionOxigeno > 100) {
            throw new IllegalArgumentException("Saturación de oxígeno no válida (0-100)");
        }
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public String registrarSignos() {
        return "Signos vitales registrados correctamente.";
    }

    public String consultarSignos() {
        return toString();
    }

    @Override
    public String toString() {
        return "SignosVitales{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", presionArterial=" + presionArterial +
                ", frecuenciaRespiratoria=" + frecuenciaRespiratoria +
                ", temperatura=" + temperatura +
                ", saturacionOxigeno=" + saturacionOxigeno +
                '}';
    }
    

    

    
}
