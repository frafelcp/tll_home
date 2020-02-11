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
public class prueba {
    public static void main(String[] args) {
        //variables
        int indice = 0;
        int i = 0;
        String caracter = "s";
        int [] vector = new int[i];
        
        Scanner leer = new Scanner(System.in);
        
        while (caracter.equals("s")) {            
            System.out.print("Ingrese el elemento:");
            vector[indice]=leer.nextInt();
            i++;
            System.out.println("Hay mas datos en el vector. s/n");
            caracter = leer.next();
        }
    }
}
