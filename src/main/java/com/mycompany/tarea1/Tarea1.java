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
        System.out.println("¡Hola! Esta es la solución de la tarea 1.");
        System.out.println();
        
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
    }

    public static void exercise1() {
        /*
            Hacer un programa en Java que le
            pida al usuario 3 números, los sume
            y muestre el resultado
         */

        System.out.println("Ejercicio 1");
        System.out.println("Digita tres números separados por espacio");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int sum = a + b + c;

        System.out.println("La suma de los números es: " + sum);
        System.out.println();
    }

    public static void exercise2() {
        /*
            0. Le pida al usuario dos números
            1. Que realice las operaciones:
            suma, resta, división, multiplicación
            y modulo.
            2. Muestre el resultado de esas operaciones.
         */
        System.out.println("Ejercicio 2");
        System.out.println("Digita dos números separados por espacio");

        Scanner input = new Scanner(System.in);

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

    public static void exercise3() {
        /*
            0. Le pida al usuario dos números
            1. Al primer numero le sume 5 y al
            segundo lo multiplique por 2.
            2. Sume los nuevos valores y lo imprima.
         */
        System.out.println("Ejercicio 3");
        System.out.println("Digita dos números separados por espacio");

        Scanner input = new Scanner(System.in);

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

    public static void exercise5() {
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

        Scanner input = new Scanner(System.in);

        int juan = input.nextInt();
        int diego = juan * 2;
        int aleja = (juan + diego) * 3;
        int total = juan + diego + aleja;

        System.out.println("Cantidad de manzanas entre los tres: " + total);
        System.out.println();
    }

    public static void exercise6() {
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

        Scanner input = new Scanner(System.in);

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

    public static void exercise7() {
        /*
            Hacer un programa que pida dos
            números al usuario. Calcule el
            cuadrado de la suma de esos dos
            numeros e imprima el resultado.
         */
        System.out.println("Ejercicio 7");
        System.out.println("Digita dos números separados por espacio");

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double total = Math.pow(a + b, 2);

        System.out.println("Solución: " + total);
        System.out.println();
    }

    public static void exercise8() {
        /*
            Hacer un programa que le pida al
            usuario un número de horas. Calcule
            e imprima el número de semanas,
            días y horas equivalentes.
         */
        System.out.println("Ejercicio 8");
        System.out.println("Digita el número de horas");

        Scanner input = new Scanner(System.in);

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

    public static void exercise9() {
        /*
            Realice un programa en Java que pida
            dos números al usuario. Imprimir cuál es
            mayor o si son iguales.
         */
        System.out.println("Ejercicio 9");
        System.out.println("Digita dos números separados por espacio");

        Scanner input = new Scanner(System.in);

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

    public static void exercise10() {
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

        Scanner input = new Scanner(System.in);

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
}
