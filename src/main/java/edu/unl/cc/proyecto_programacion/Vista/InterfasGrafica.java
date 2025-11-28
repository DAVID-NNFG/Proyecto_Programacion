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

        Paciente paciente = null;
        SignosVitales signos = null;
        Registro_de_Signos registro = null;

        System.out.println("SISTEMA DE SIGNOS VITALES\n");


        while (paciente == null) {
            try {
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = Integer.parseInt(sc.nextLine());

                System.out.print("Ingrese género: ");
                String genero = sc.nextLine();

                System.out.print("Ingrese identificación: ");
                String identificacion = sc.nextLine();

                // Aquí se usan los setters que validan todo
                paciente = new Paciente(nombre, edad, genero, identificacion);

            } catch (Exception e) {
                System.out.println("\n⚠ ERROR: " + e.getMessage());
                System.out.println("Vuelva a ingresar los datos del paciente.\n");
            }
        }

        System.out.println("\n✔ PACIENTE REGISTRADO");
        System.out.println(paciente.registrarPaciente());
        System.out.println(paciente.consultarPaciente());

  // los parametros ya estan definidos y los valores ingresados tiene que estar en esos parametros 
        while (signos == null) {
            try {
                System.out.println("\n--- Ingrese los signos vitales ---");

                System.out.print("Altura (0.30 - 2.50): ");
                double altura = Double.parseDouble(sc.nextLine());

                System.out.print("Peso (1 - 500 kg): ");
                double peso = Double.parseDouble(sc.nextLine());

                System.out.print("Frecuencia cardiaca (2-220): ");
                double fc = Double.parseDouble(sc.nextLine());

                System.out.print("Presión arterial (solo número): ");
                double pa = Double.parseDouble(sc.nextLine());

                System.out.print("Saturación de oxígeno (0-100): ");
                double spo2 = Double.parseDouble(sc.nextLine());

                signos = new SignosVitales(altura, peso, fc, pa, spo2);

            } catch (Exception e) {
                System.out.println("\n⚠ ERROR: " + e.getMessage());
                System.out.println("Vuelva a ingresar los signos vitales.\n");
            }
        }

        System.out.println("\n✔ SIGNOS VITALES REGISTRADOS");
        System.out.println(signos.registrarSignos());
        System.out.println(signos.consultarSignos());


        registro = controlador.guardarSignos(paciente, signos);

        System.out.println("\n===== REGISTRO COMPLETO =====");
        System.out.println(controlador.crearHistorialdeSignos(registro));

        System.out.println("\nFIN DEL PROGRAMA");
    }
}
