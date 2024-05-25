
package com.mycompany.m5_uf2_pr4;


import java.util.ArrayList;
import java.util.List;

public class Utilidades {
    
    public static List<Integer> descomponerPrimos (int num) {
        List<Integer> primos = new ArrayList<>();
        
        // Factorización de primos
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                primos.add(i);
                num /= i;
            }
        }
        
        return primos;
    
    }
    
    public static List<Integer> fibonacci(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int a = 0, b = 1;
        secuencia.add(a);
        secuencia.add(b);
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            secuencia.add(temp);
        }
        return secuencia;
    }
    
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean esNumeroPerfecto(int numero) {
        int suma = 1;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                suma += i;
                if (i * i != numero) {
                    suma += numero / i;
                }
            }
        }
        return suma == numero && numero != 1;
    }
    
    public static double[] resolverEcuacionSegundoGrado(double a, double b, double c) {
        double[] soluciones = new double[2];
        
        // Calculando el discriminante
        double discriminante = b * b - 4 * a * c;
        
        // Caso 1: dos soluciones reales distintas
        if (discriminante > 0) {
            soluciones[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        } 
        // Caso 2: solución real única
        else if (discriminante == 0) {
            soluciones[0] = -b / (2 * a);
            soluciones[1] = soluciones[0]; // Ambas soluciones son iguales
        } 
        // Caso 3: soluciones complejas
        else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            soluciones[0] = parteReal + parteImaginaria;
            soluciones[1] = parteReal - parteImaginaria;
        }
        
        return soluciones;
    }
}
