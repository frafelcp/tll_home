/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class uno {

    public static void main(String[] args) {
        //variables
        int canNum;
        double[] numeros;

        //modo desarrollador
        Scanner leer = new Scanner(System.in);
        
        //inicializacion
        System.out.print("ingrese la cantidad de numeros:");
        canNum = leer.nextInt();
        
        numeros = new double[canNum];
        
        //LEER VECTOR
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero en la posicion " + (i + 1) + ":");
            numeros[i] = leer.nextDouble();
        }
        
        //PROMEDIO
        double sum = 0;
        double prom;
        
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        
        prom = sum / numeros.length;
        
        System.out.println("El promedio es:" + prom);
        
        //VECTORES MENOR IGUAL A PROMEDIO Y MAYOR AL PROMEDIO
        //menor igual al promedio
        //variables
        double [] VMenor;
        int menor;
        
        //inicializacion
        VMenor = new double[numeros.length];
        menor = 0;
        
        //lectura, creacion del vector menor igual al promedio
        for (int i = 0; i < VMenor.length; i++) {
            if (numeros[i] <= prom) {
                VMenor[menor] = numeros[i];
                menor++;
            }
        }
        
        //escribir vector menor
        System.out.println("Menores;");
        for (int i = 0; i < VMenor.length; i++) {            
            if (VMenor[i] <= prom && VMenor[i] != 0) {
                System.out.print("El elemento " + (i + 1) + ":" + VMenor[i] + "\n");
            } else {
                System.out.println("No hay");
            }            
        }
        
        //mayor al promedio
        //variables
        double [] VMayor;
        int mayor;
        
        //inicializacion
        VMayor = new double[numeros.length];
        mayor = 0;
        
        //lectura, creacion del vector menor superior al promedio
        for (int i = 0; i < VMayor.length; i++) {
            if (numeros[i] > prom) {
                VMenor[mayor] = numeros[i];
                mayor++;
            }
        }
        
        //escribir vector mayor
        System.out.println("Mayores:");
        for (int i = 0; i < VMayor.length; i++) {            
            if (VMayor[i] > prom) {
                System.out.print("El elemento " + (i + 1) + ":" + VMayor[i] + "\n");
            } else {
                System.out.println("No hay");
            }
        }
        
    }
}
