/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Vista;

import edu.unl.cc.proyecto_programacion.Controlador.Paciente;
import edu.unl.cc.proyecto_programacion.Controlador.Registro_de_Signos;
import edu.unl.cc.proyecto_programacion.Controlador.SignosVitales;

/**
 *David-NNFG, camilachim, Etxhn
 * @author 
 */
public class Controlador_de_SignosVitales {
    
    public Registro_de_Signos guardarSignos(Paciente paciente, SignosVitales signos) {
        return new Registro_de_Signos(paciente, signos);
    }

    public String crearHistorialdeSignos(Registro_de_Signos registro) {
        return "Historial generado:\n" + registro.toString();
    }

    @Override
    public String toString() {
        return "Controlador_de_SignosVitales{}";
    }
    
}
