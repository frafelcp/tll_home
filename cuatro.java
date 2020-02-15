/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class cuatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //LEER PRIMER VECTOR
        //variables
        int canNum1;
        int[] vNum1;

        //inicializacion
//        canNum1 = Integer.parseInt(JOptionPane.showInputDialog("cantidad de numeros"));
        canNum1 = leer.nextInt();
        vNum1 = new int[canNum1];

        //leer vector
        for (int i = 0; i < vNum1.length; i++) {
//            vNum1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "
//                    + "numero " + (i + 1)));
            System.out.print("numero " + (i + 1) + " al vector 1:");
            vNum1[i] = leer.nextInt();
        }

        //escribir vector
        for (int i = 0; i < vNum1.length; i++) {
            System.out.println("El vector 1 posicion " + (i + 1) + "es: " + vNum1[i]);
        }

        //LEER SEGUNDO VECTOR
        //variables
        int canNum2;
        int[] vNum2;

        //inicializacion
        canNum2 = canNum1;
        vNum2 = new int[canNum2];

        //leer vector
        for (int i = 0; i < vNum2.length; i++) {
            vNum2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "
                    + "numero " + (i + 1)));
            vNum2[i] = leer.nextInt();
        }

        //VECTOR 3 DE SUMA DE VECTOR 1 Y 2
        //variables
        
        int cantNum3;
        int[] vSum;
        String suma;

        //inicializacion
//        in = 0;
        cantNum3 = canNum2;
        vSum = new int[cantNum3];
        suma = " ";

        //suma
        for (int i = 0; i < canNum1; i++) {
            vSum[i] = vNum1[i] + vNum2[i];
            suma = suma + vSum[i] + ", ";
        }

        //escribir vector
        System.out.println("El suma es " + suma);
//        for (int i = 0; i < vSum.length; i++) {
//            System.out.println("El vector suma posicion " + (i + 1) + "es: " + vSum[i]);
//        }
    }
}
