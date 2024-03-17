/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author wilson
 */
public class Canido extends Animal {

    public Canido(
            String sonido, 
            String alimento, 
            String habitat, 
            String nombreCientifico
    ) {
        super(sonido, alimento, habitat, nombreCientifico);
    }
    
    @Override
    public String getNombreCientifico(){
        return nombreCientifico;
    }
    
    @Override
    public String getSonido(){
        return sonido;
    }
    
    @Override
    public String getAlimento(){
        return alimento;
    }
    
    @Override
    public String getHabitat(){
        return habitat;
    }
}
