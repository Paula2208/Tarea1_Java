/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

import java.util.HashMap;

/**
 *
 * @author Wilson
 */
public class Restaurante {
    public HashMap<String, Integer> menuPlatos;
    public HashMap<String, Integer> menuBebidas;
    public HashMap<String, Integer> menuPostres;

    public Restaurante() {
        System.out.println("¡Hola! Bienvenido al restaurante.");
        
        // Inicialización de menús
        this.menuPlatos = new HashMap<String, Integer>();
        this.menuBebidas = new HashMap<String, Integer>();
        this.menuPostres = new HashMap<String, Integer>();
        
        menuPlatos.put("Albóndigas con puré de papa", 25400);
        menuPlatos.put("Pasta con pollo en salsa de champiñones", 28000);
        menuBebidas.put("Jugo de mango", 6000);
        menuBebidas.put("Café frío", 3200);
        menuPostres.put("Leche Asada", 5800);
        menuPostres.put("Pie de Limón", 4500);
    }
    
    public void nuevoPlato(String nombre, int valor){
        menuPlatos.put(nombre, valor);
    }
    
    public void nuevoPostre(String nombre, int valor){
        menuPostres.put(nombre, valor);
    }
    
    public void nuevaBebida(String nombre, int valor){
        menuBebidas.put(nombre, valor);
    }
    
    public void mostrarMenú(){
        System.out.println();
        System.out.println("                          Menú");
        
        System.out.println("**Platos Fuertes**");
        for(String nombrePlato : menuPlatos.keySet()){
            System.out.println(nombrePlato + " ................................................................. " + menuPlatos.get(nombrePlato));
        }
        System.out.println();
        
        System.out.println("**Bebidas**");
        for(String nombrePlato : menuBebidas.keySet()){
            System.out.println(nombrePlato + " ................................................................. " + menuBebidas.get(nombrePlato));
        }
        System.out.println();
        
        System.out.println("**Postres**");
        for(String nombrePlato : menuPostres.keySet()){
            System.out.println(nombrePlato + " ................................................................. " + menuPostres.get(nombrePlato));
        }
        System.out.println();
    }
    
    public int realizarPedido(String plato1, String bebida){
        return menuPlatos.get(plato1) + menuBebidas.get(bebida);
    }
    
    public int realizarPedido(String plato1, String plato2, String bebida){
        return menuPlatos.get(plato1) + menuPlatos.get(plato2) + menuBebidas.get(bebida);
    }
    
    public int realizarPedido(String plato1, String plato2, String bebida, String postre){
        return menuPlatos.get(plato1) + menuPlatos.get(plato2) + menuBebidas.get(bebida) + menuPostres.get(postre);
    }
}
