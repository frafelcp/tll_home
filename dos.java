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
public class dos {

    public static void main(String[] args) {
        //lectura por consola
        Scanner leer = new Scanner(System.in);

        //ESTUDIANTES QUE PERDIERON COMPUTADORES
        //variables
        int cedComp;
        int[] vComp;

        //inicializacion        
        cedComp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "
                + "de estudiantes que perdieron computadores"));

        vComp = new int[cedComp];

        //Lectura
        for (int i = 0; i < vComp.length; i++) {            
            vComp[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "
                    + "cedula del estudiante " + (i + 1)));
        }

        //escribir
        for (int i = 0; i < vComp.length; i++) {
            JOptionPane.showMessageDialog(null, "Estudiantes que perdieron "
                    + "computadores:\n" + (i + 1) + "." + vComp[i]);
        }

        //ESTUDIANTES QUE PERDIERON ALGORITMOS
        //variables
        int cedAlgo;
        int[] vAlgo;

        //inicializacion
        cedAlgo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "
                + "de estudiantes que perdieron algoritmos"));

        vAlgo = new int[cedAlgo];

        //Lectura
        for (int i = 0; i < vAlgo.length; i++) {            
            vAlgo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "
                    + "cedula del estudiante " + (i + 1)));
        }

        //escribir
        for (int i = 0; i < vAlgo.length; i++) {
            JOptionPane.showMessageDialog(null, "Estudiantes que perdieron "
                    + "algoritmos:\n" + (i + 1) + "." + vAlgo[i]);
        }

        //ESTUDIANTES QUE PERDIERON COMPUTADORES Y ALGORITMOS
        //variables
        int k;//indice
        int tam;//tamaño
        int[] vComAlg;//vector

        //inicializacion
        k = 0;
        tam = 5;
        vComAlg = new int[tam];

        //lectura
        for (int i = 0; i < vComp.length; i++) {
            for (int j = 0; j < vAlgo.length; j++) {
                if (vComp[i] == vAlgo[j]) {
                    vComAlg[k] = vComp[i];
                    k++;
                    tam = k;
                }
            }
        }

        //escribir
        for (int i = 0; i < vComAlg.length; i++) {
            if (vComAlg[i] != 0) {
                JOptionPane.showMessageDialog(null, "Estudiantes que perdieron "
                    + "computadores y algoritmos:\n" + (i + 1) + "." + vComAlg[i]);
                System.out.println((i + 1) + "." + vComAlg[i]);
            } else {
                System.out.println("No hay");
            }
        }
    }
}
