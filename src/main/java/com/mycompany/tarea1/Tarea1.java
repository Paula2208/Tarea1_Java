/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tarea1;

import java.util.Scanner;

/**
 *
 * @author Wilson Gil
 */
public class Tarea1 {

    public static void main(String[] args) {
        System.out.println("¡Hola! Esta es la solución de algunos puntos de las tareas 1, 2 y 4.");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        // Puedes seleccionar varias líneas a la vez
        // Luego, con ctrl +shift +c puedes comentar las líneas seleccionadas
        // El mismo comando para descomentarlas
        
//        System.out.println("-------------------------------------------------------------------* Solución Tarea 1 *-------------------------------------------------------------------");
//        System.out.println();
//        exercise1(input);
//        exercise2(input);
//        exercise3(input);
//        exercise4();
//        exercise5(input);
//        exercise6(input);
//        exercise7(input);
//        exercise8(input);
//        exercise9(input);
//        exercise10(input);
//        
//        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println();
//        System.out.println();
//        
//        System.out.println("-------------------------------------------------------------------* Solución Tarea 2 *-------------------------------------------------------------------");
//        System.out.println();
        
//        exercise9B(input);
//        exercise11(input);
//        exercise13(input);
//        exercise15(input);
//        exercise17(input);
//        exercise19(input);
//        exercise21(input);
//        exercise23(input);
//        
//        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println();
//        System.out.println();
//        
//        System.out.println("-------------------------------------------------------------------* Solución Tarea 3 *-------------------------------------------------------------------");
//        System.out.println();
//        
//        exercise24(input);
        exercise26(input);
//        
//        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println();
        
        input.close();
        System.out.println();
        System.out.println("¡Adiós! <3");
        System.out.println();
    }

    public static void exercise1(Scanner input) {
        /*
            Hacer un programa en Java que le
            pida al usuario 3 números, los sume
            y muestre el resultado
         */

        System.out.println("Ejercicio 1");
        System.out.println("Digita tres números separados por espacio");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int sum = a + b + c;

        System.out.println("La suma de los números es: " + sum);
        System.out.println();
    }

    public static void exercise2(Scanner input) {
        /*
            0. Le pida al usuario dos números
            1. Que realice las operaciones:
            suma, resta, división, multiplicación
            y modulo.
            2. Muestre el resultado de esas operaciones.
         */
        System.out.println("Ejercicio 2");
        System.out.println("Digita dos números separados por espacio");

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mult = a * b;
        int mod = a % b;

        System.out.println("*** Operaciones ***");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " % " + b + " = " + mod);
        System.out.println();
    }

    public static void exercise3(Scanner input) {
        /*
            0. Le pida al usuario dos números
            1. Al primer numero le sume 5 y al
            segundo lo multiplique por 2.
            2. Sume los nuevos valores y lo imprima.
         */
        System.out.println("Ejercicio 3");
        System.out.println("Digita dos números separados por espacio");

        int a = input.nextInt();
        int b = input.nextInt();

        a = a + 5;
        b = b * 2;
        int sum = a + b;

        System.out.println("Solución: " + sum);
        System.out.println();
    }

    public static void exercise4() {
        /*
            El salario de un empleado A es
            45000 por hora y el salario del
            empleado B es 30000 por hora. Si el
            empleado A trabaja 10 horas a la
            semana y el empleado B 15 horas.
        
            Hacer un programa que calcule e
            imprima cuanto gana a la semana
            cada empleado.
         */
        System.out.println("Ejercicio 4");

        int employeeA = 45000 * 10;
        int employeeB = 30000 * 15;

        System.out.println("Salario semanal para el empleado A: " + employeeA);
        System.out.println("Salario semanal para el empleado B: " + employeeB);
        System.out.println();
    }

    public static void exercise5(Scanner input) {
        /*
            Juan tiene N manzanas, Diego tiene el
            doble de manzanas que Juan y Alejandra
            tiene el triple de la cantidad de
            manzanas que Juan y Diego tienen juntos.
        
            Hacer un programa que calcule e
            imprima la cantidad de manzanas que
            tienen entre los tres.
         */
        System.out.println("Ejercicio 5");
        System.out.println("Digita la cantidad de manzanas que tiene Juan");

        int juan = input.nextInt();
        int diego = juan * 2;
        int aleja = (juan + diego) * 3;
        int total = juan + diego + aleja;

        System.out.println("Cantidad de manzanas entre los tres: " + total);
        System.out.println();
    }

    public static void exercise6(Scanner input) {
        /*
            Realice un programa que calcule e imprima
            la calificación obtenida por un estudiante
            dados los siguientes porcentajes de clase:
                
                Proyecto --> 45%
                Tareas --> 30%
                Taller --> 10%
                Exposición --> 10%
                Asistencia --> 10%
         */
        System.out.println("Ejercicio 6");

        try {
            System.out.println("Digita la calificación de proyecto: ");
            float proyect = input.nextFloat();

            System.out.println("Digita la calificación de tareas: ");
            float homework = input.nextFloat();

            System.out.println("Digita la calificación de taller: ");
            float workshop = input.nextFloat();

            System.out.println("Digita la calificación de exposición: ");
            float expo = input.nextFloat();

            System.out.println("Digita la calificación de asistencia: ");
            float classes = input.nextFloat();

            float total = (proyect * 0.45f) + (homework * 0.3f) + (workshop * 0.1f) + (expo * 0.1f) + (classes * 0.1f);

            System.out.println("Calificación final del estudiante: " + total);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Por favor verifica tu entrada. Los números tipo float deben ser con come (,) decimal.");
            System.out.println();
        }
    }

    public static void exercise7(Scanner input) {
        /*
            Hacer un programa que pida dos
            números al usuario. Calcule el
            cuadrado de la suma de esos dos
            numeros e imprima el resultado.
         */
        System.out.println("Ejercicio 7");
        System.out.println("Digita dos números separados por espacio");

        double a = input.nextDouble();
        double b = input.nextDouble();

        double total = Math.pow(a + b, 2);

        System.out.println("Solución: " + total);
        System.out.println();
    }

    public static void exercise8(Scanner input) {
        /*
            Hacer un programa que le pida al
            usuario un número de horas. Calcule
            e imprima el número de semanas,
            días y horas equivalentes.
         */
        System.out.println("Ejercicio 8");
        System.out.println("Digita el número de horas");

        int a = input.nextInt();

        int weeks = 0;
        int days = 0;
        int hours = a;

        // @todo 
        System.out.println("El número de semanas es: " + weeks);
        System.out.println("El número de días es: " + days);
        System.out.println("El número de horas es: " + hours);
        System.out.println();
    }

    public static void exercise9(Scanner input) {
        /*
            Realice un programa en Java que pida
            dos números al usuario. Imprimir cuál es
            mayor o si son iguales.
         */
        System.out.println("Ejercicio 9");
        System.out.println("Digita dos números separados por espacio");

        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println("El número " + a + " es mayor que el número " + b);
        } else if (a < b) {
            System.out.println("El número " + b + " es mayor que el número " + a);
        } else {
            System.out.println("Los números " + a + " y " + b + " son iguales.");
        }

        System.out.println();
    }

    public static void exercise10(Scanner input) {
        /*
            Una manzana cuesta $2500, un aguacate $6000
            y un mango $4500. Si la compra de un cliente
            supera los $30000, se le realiza un descuento
            del 10% en su compra.
        
            Realice un programa en Java que pida al usuario
            3 valores, cada uno indica el número de manzanas,
            aguacates y mangos que compra el cliente C. Imprima
            el valor final de la compra del cliente.
         */
        System.out.println("Ejercicio 10");

        System.out.println("Digita la cantidad de manzanas");
        double apples = input.nextDouble();

        System.out.println("Digita la cantidad de aguacates");
        double avocates = input.nextDouble();

        System.out.println("Digita la cantidad de mangos");
        double mangos = input.nextDouble();

        double total = (apples * 2500) + (avocates * 6000) + (mangos * 4500);

        if (total > 30000) {
            total = (90 * total) / 100;
        }

        System.out.println("El valor total de la compra es: $" + total);
        System.out.println();
    }
    
    public static void exercise9B(Scanner input) {
        /*
            Pedir un número N al usuario e indicarle
            si el número es par o impar. Esto se repetirá 8 veces
         */
        System.out.println("Ejercicio 9B"); // 9 en el listado del excel jeje
        System.out.println("A continuación se te pedirán 8 números, luego de cada entrada se dirá si es par o impar");
        
        for(int i = 0; i < 8; i++){
            if(i == 0){
                System.out.println("Ingresa un número");
            }
            else{
                System.out.println("Ingresa otro número");
            }
            
            int a = input.nextInt();
            
            if(a%2 == 0){
                System.out.println(a+" es un número par");
            }
            else{
                System.out.println(a+" es un número impar");
            }
            System.out.println("");
        }
       
        System.out.println();
    }
    
    public static void exercise11(Scanner input) {
        /*
            Pedir un número N al usuario e impirmit la multiplicación
            de todos los números pares menores o iguales a N
         */
        System.out.println("Ejercicio 11");
        System.out.print("Ingrese un número: ");
        int a = input.nextInt();

        long mult = 1;
        for(int i = 2; i <= a; i += 2) {
            mult *= i;
        }
        
        System.out.println("La multiplicación de todos los números pares menores o iguales a " + a + " es: " + mult);
       
        System.out.println();
    }
    
    public static void exercise13(Scanner input) {
        /*
            Pedir 9 números al usuario, e imprimir
            cuántos números múltiplos de 3 se han introducido.
            Imprimir también los números pares.
         */
        System.out.println("Ejercicio 13");
        System.out.println("Digita 9 números separados por espacio");
        
        String mult3 = "";
        String pares = "";
        int paresCount = 0;
        int mult3Count = 0;
        
        for(int i = 0; i < 9; i++){
            int a = input.nextInt();
            
            if(a%2 == 0){
                pares = pares + " " + a;
                paresCount++;
            }
            else if (a%3 == 0){
                mult3 = mult3 + " " + a;
                mult3Count++;
            }
        }
        
        System.out.println();
        
        System.out.println("Hay "+ mult3Count + " números múltiplos de 3:" + mult3);
        System.out.println("Hay "+ paresCount + " números pares:" + pares);
        System.out.println();
    }
    
    public static void exercise15(Scanner input) {
        /*
            Pedir dos números al usuario: N y D.
            Leer N números, guardarlos en un arreglo de tamaño N,
            desplace D posiciones a la derecha los elementos del arreglo
            e imprima el nuevo arreglo.
         */
        System.out.println("Ejercicio 15");
        System.out.println("Ingrese la cantidad de números (N): ");
        int N = input.nextInt();
        
        System.out.println("Ingrese la cantidad de posiciones a la derecha a desplazar (D): ");
        int D = input.nextInt();
        
        int[] original = new int[N];
        int[] desplazado = new int[N];
        
        System.out.println("Ingrese "+ N + " números separados por espacio: ");
        for (int i = 0; i < N; i++) {
            original[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            desplazado[(i + D) % N] = original[i];
        }
        
        System.out.println();
        System.out.print("El arreglo luego del desplazamiento es: [");
        for (int i = 0; i < N; i++) {
            if(i == N-1) {
                System.out.print(desplazado[i]);
            }
            else{
                System.out.print(desplazado[i] + ", ");
            }
        }
        System.out.print("]");
       
        System.out.println();
    }
    
    public static void exercise17(Scanner input) {
        /*
            Pedir un arreglo N al usuario. Crear un arreglo de tamaño N e
            ingresar los números de ese arreglo. Imprimir si los números
            ingresados al arreglo están de forma creciente, decreciente,
            desordenados o si todos son iguales.
         */
        System.out.println("Ejercicio 17");
        System.out.println("Ingrese la cantidad de números (N): ");
        int N = input.nextInt();
        
        int[] nums = new int[N];
        boolean creciente = true;
        boolean decreciente = true;
        boolean igual = true;
        
        System.out.println("Ingrese "+ N + " números separados por espacio: ");
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
            
            if(i != 0){
                if(nums[i] != nums[i-1]) igual = false;
                if(nums[i] > nums[i-1]) decreciente = false;
                if(nums[i] < nums[i-1]) creciente = false;
            }
        }
        
        if(igual) System.out.println("El arreglo es de números iguales");
        if(creciente && !igual) System.out.println("El arreglo es creciente");
        if(decreciente && !igual) System.out.println("El arreglo es decreciente");
        if(!igual && !creciente && !decreciente) System.out.println("El arreglo está desordenado");

        System.out.println();
    }
    
    public static void exercise19(Scanner input) {
        /*
            Pedir un número N al usuario. Leer N números, guardarlos
            en un arreglo de tamaño N. Imprimir dos arreglos, uno con 
            los números pares del arreglo original y otro con los números
            impares.
         */
        System.out.println("Ejercicio 19");
        System.out.println("Ingrese la cantidad de números (N): ");
        int N = input.nextInt();
        
        int[] nums = new int[N];
        int[] pares = new int[N];
        int[] impares = new int[N];
        int paresCount = 0;
        int imparesCount = 0;
        
        System.out.println("Ingrese "+ N + " números separados por espacio: ");
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
            
            if(i % 2 == 0){
                pares[paresCount] = nums[i];
                paresCount++;

            }
            else{
                impares[imparesCount] = nums[i];
                imparesCount++;
            }
        }

        System.out.print("En el arreglo [");
        for (int i = 0; i < N; i++) {
            if(i == N-1){
                System.out.print(nums[i]);
                continue;
            }
            System.out.print(nums[i] + " ,");
        }
        System.out.print("]");
        
        System.out.println();
        System.out.print("Existen los números pares: [");
        for (int i = 0; i < paresCount; i++) {
            if(i == paresCount-1){
                System.out.print(pares[i]);
                continue;
            }
            System.out.print(pares[i] + " ,");
        }
        System.out.print("]");
        
        System.out.println();
        System.out.print("Existen los números impares: [");
        for (int i = 0; i < imparesCount; i++) {
            if(i == imparesCount-1){
                System.out.print(impares[i]);
                continue;
            }
            System.out.print(impares[i] + " ,");
        }
        System.out.print("]");
       
        System.out.println();
    }
    
    public static void exercise21(Scanner input) {
        /*
            Llenar las entradas de una matriz de tamaño 3x3,
            imprimir la matriz original y su transpuesta.
         */
        System.out.println("Ejercicio 21");
        int[][] mat = new int[3][3];
        int[][] trans = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                mat[i][j] = input.nextInt();
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println();
    }
    
    public static void exercise23(Scanner input) {
        /*
            Crear y llenar dos matrices, una de tamaño 3x3 donde sus
            elementos son números y otra de tamaño 4x4 donde sus
            elementos son letras. Sumar los elementos que se encuentran
            en la diagonal de la matriz de números e imprimir el resultado.
            Imprimir los elementos en la diagonal de la matriz de letras.
         */
        System.out.println("Ejercicio 23");
        int[][] nums = new int[3][3];
        char[][] lets = new char[4][4];
        int sumDiag = 0;
        String letsDiag = "";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                nums[i][j] = input.nextInt();
                
                if(i == j) sumDiag = sumDiag + nums[i][j];
            }
        }
        
        for (int i = 0; i < 4 ; i++) {
            if( i == 0 ){
                System.out.println("Ingrese la primera fila de letras. Ejemplo (abcd)");
                input.nextLine();
            }
            else{
                System.out.println("Ingrese la siguiente fila de letras. Ejemplo (abcd)");
            }
            
            String letsLine = input.nextLine();
            for (int j = 0; j < 4; j++) {
                lets[i][j] = letsLine.charAt(j);
                
                if(i == j) letsDiag = letsDiag + " " +lets[i][j];
            }
        }
        
        System.out.println();
        
        System.out.println("La suma de la diagonal de la matriz de números es: " + sumDiag);
        System.out.println("Los elementos de la diagonal de la matriz de letras son: " + letsDiag);
       
        System.out.println();
    }
    
    public static void exercise24(Scanner input) {
        /*
            Clase Avión.
         */
        System.out.println("Ejercicio 24");
        Avion a = new Avion("Boeing", 3);
        Avion b = new Avion("Airbus", 2);
        
        a.imprimirFabricante();
        b.imprimirFabricante();
        
        a.cambiarFabricante(b);
        
        b.imprimirFabricante();
       
        System.out.println();
    }
    
    public static void exercise26(Scanner input) {
        /*
            Restaurante y pedidos.
         */
        System.out.println("Ejercicio 26");

       
        System.out.println();
    }
}
