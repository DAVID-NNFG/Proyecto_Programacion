/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author DAVID-NNFG
 */
public class Paciente {
    
    private String identificacion;
    private String nombre;
    private int edad;
    private String sexo;

    public Paciente(String identificacion, String nombre, int edad, String sexo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
     public Paciente() {}

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    } 
    
}
