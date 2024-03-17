/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author Wilson
 */
public abstract class Animal {
    protected String sonido;
    protected String alimento;
    protected String habitat;
    protected String nombreCientifico;

    public Animal(String sonido, String alimento, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimento = alimento;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }
    
    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimento();
    public abstract String getHabitat();
}
