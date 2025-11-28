/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Vista;
import java.util.Scanner;
import edu.unl.cc.proyecto_programacion.Controlador.Paciente;
import edu.unl.cc.proyecto_programacion.Controlador.Registro_de_Signos;
import edu.unl.cc.proyecto_programacion.Controlador.SignosVitales;
/**
 *
 * @author DAVID-NNFG
 */
public class InterfasGrafica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controlador_de_SignosVitales controlador = new Controlador_de_SignosVitales();

        System.out.println(" SISTEMA DE SIGNOS VITALES PRUEBA CONSOLA\n");

        // Datos del pasiente 
      
        System.out.print("Ingrese nombre del paciente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad del paciente: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese identificación: ");
        double id = sc.nextDouble();

        Paciente paciente = new Paciente(nombre, edad, id);

        System.out.println("\n--- Datos del Paciente registrados ---");
        System.out.println(paciente.consultarPaciente());

        // datos de los signos vitales 
        
        System.out.println("\nIngrese signos vitales:");

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Frecuencia cardiaca: ");
        double fc = sc.nextDouble();

        System.out.print("Presión arterial (solo número): ");
        double pa = sc.nextDouble();

        System.out.print("Saturación de oxígeno (%): ");
        double spo2 = sc.nextDouble();

        SignosVitales sv = new SignosVitales(altura, peso, fc, pa, spo2);

        Registro_de_Signos registro = controlador.guardarSignos(paciente, sv);

        System.out.println("\n==== REGISTRO CREADO =====");
        System.out.println(registro.toString());

        System.out.println("\n===== HISTORIAL =====");
        System.out.println(controlador.crearHistorialdeSignos(registro));

        System.out.println("\nFIN DEL PROGRAMA");
    } 
}
