/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author Wilson
 */
public class Avion {
    private String fabricante; // Nombre del fabricante
    private int motores; // Número de motores

    public Avion(String fab, int mots) {
        this.fabricante = fab;
        this.motores = mots;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }
    
    public void imprimirFabricante (){
        System.out.println("Nombre del fabricante: " + this.fabricante);
    }
    
    public void cambiarFabricante(Avion a){
        a.setFabricante("Loockhead");
    }
}
