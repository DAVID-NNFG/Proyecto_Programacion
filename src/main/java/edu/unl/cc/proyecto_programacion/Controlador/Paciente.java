/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author DAVID-NNFG, camilachim, Etxhn
 */
public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    private String identificacion; 


    public Paciente(String nombre, int edad, String genero, String identificacion) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setIdentificacion(identificacion);
    }


    public Paciente() {}

    public void setIdentificacion(String identificacion) {
        if (identificacion == null || !identificacion.matches("\\d{10}")) {
            throw new IllegalArgumentException("Identificación ciudadana no valida");
        }
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("Ingresar su primer nombre y apellido");
        }

        String texto = nombre.trim();
        String[] partes = texto.split("\\s+"); 

        if (partes.length != 2) {
            throw new IllegalArgumentException("Ingresar su primer nombre y apellido");
        }

        if (!texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+\\s[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
            throw new IllegalArgumentException("Ingresar su primer nombre y apellido");
        }

        this.nombre = texto;
    }

    public void setEdad(int edad) {
        if (edad < 1 || edad > 99) {
            throw new IllegalArgumentException("Edad no válida (1-99)");
        }
        this.edad = edad;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new IllegalArgumentException("Género no válido (Hombre/Mujer)");
        }
        String g = genero.trim().toLowerCase();
        if (!g.equals("hombre") && !g.equals("mujer")) {
            throw new IllegalArgumentException("Género no válido (Hombre/Mujer)");
        }
        this.genero = g.substring(0,1).toUpperCase() + g.substring(1);
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }
    public String getIdentificacion() { return identificacion; }

    public String registrarPaciente() {
        return "Paciente registrado: " + nombre +
               " | Edad: " + edad +
               " | Género: " + genero +
               " | ID: " + identificacion;
    }

    public void actualizarDatos(String nuevoNombre, int nuevaEdad, String nuevoGenero) {
        setNombre(nuevoNombre);
        setEdad(nuevaEdad);
        setGenero(nuevoGenero);
    }

    public String consultarPaciente() {
        return toString();
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
    
}
