/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_programacion.Controlador;

/**
 *
 * @author David-NNFG, camilachim, Etxhn
 */
public class Usuario {
    
    private String rol; 
    private String nombre;

    public Usuario(String rol, String nombre) {
        this.rol = rol;
        this.nombre = nombre;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rol=" + rol + ", nombre=" + nombre + '}';
    }
    
    
    
}
