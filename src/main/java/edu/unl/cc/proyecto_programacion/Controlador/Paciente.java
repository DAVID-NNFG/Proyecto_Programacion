/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author David-NNFG, camilachim, Etxhn
 */
public class Paciente {
    
    private String identificacion; // Identificacion del pasiente(Puede ser el numero de cedula)
    private String nombre; // Nombre del pasiente 
    private int edad;     // Edaad del pasiente 
    private String genero;  // Genero del pasiente 

    public Paciente(String identificacion, String nombre, int edad, String genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
     public Paciente() {}

    public Paciente(String nombre, int edad, double id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String registrarPaciente() {
        return "Paciente registrado: " + nombre + 
               " | Edad: " + edad +
               " | ID: " + identificacion;
    }
    
    public void actualizarDatos(String nuevoNombre, int nuevaEdad) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
    }
    
     public String consultarPaciente() {
        return "Paciente{" +
               "Nombre='" + nombre + '\'' +
               ", Edad=" + edad +
               ", Identificación=" + identificacion +
               '}';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("identificacion=").append(identificacion);
        sb.append(", nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", sexo=").append(genero);
        sb.append('}');
        return sb.toString();
    } 
    
}
