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
public class tres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //MENU
        //variables
        int op;

        //inicializacion
        System.out.println("Menu\n1.Usando cadena como vector\n2.Usando vector");
        op = leer.nextInt();

        //seleccion de opcion
        switch (op) {
            case 1:
                //LEER PALABRA
                //variables
                String palString;

                //inicializacion
                System.out.print("Ingrese una palabra:");
                palString = leer.next();

                //BUSCAR PALINDROMO
                //variables
                int in;
                int de;
                boolean bErr;

                //inicializacion
                in = 0;
                de = palString.length() - 1;
                bErr = false;

                //comparamos
                while ((in < de) && (!bErr)) {
                    if (palString.charAt(in) == palString.charAt(de)) {
                        in++;
                        de--;
                    } else {
                        bErr = true;
                    }
                }

                
                break;
            case 2:
                //LEER PALABRA
                //variables
                String palabra;
                String[] pala;

                //inicializacion
                System.out.print("Ingrese una palabra:");
                palabra = leer.next();
                pala = new String[palabra.length()];

                //leer
                System.out.println("Ingresar nuevamente la palabra " + palabra
                        + " letra por letra");
                for (int i = 0; i < pala.length; i++) {
                    System.out.print("ingrese la letra " + palabra.charAt(i) + ":");
                    pala[i] = leer.next();
                }

                //BUSCAR PALINDROMO
                //variables
                int inc;
                int dec;
                boolean bError;

                //inicializacion
                inc = 0;
                dec = pala.length - 1;
                bError = false;

                //comparamos
                while ((inc < dec) && (!bError)) {
                    if (pala[inc].equals(pala[dec])) {
                        inc++;
                        dec--;
                    } else {
                        bError = true;
                    }
                }

                if (!bError) {
                    System.out.println(palabra + " es un PALINDROMO");
                } else {
                    System.out.println(palabra + " NO es un palindromo");
                }
        }

    }
}
