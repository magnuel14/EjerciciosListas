
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioslistas.ProblemaAB;

/**
 *
 * @author Juan Pablo
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioKFC {

    public static void PaqueteAB() {
        Scanner entrada = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Paquete a");
            System.out.println("2. Paquete b");
            System.out.println("3. Salir");

            System.out.println("Elija una opción:");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la capacidad del paquete a:");
                    //tamaño paquete a
                    int tamañoPA = (int) (entrada.nextInt());
                    String paqueteA[] = new String[tamañoPA];
                    LLenarVector(paqueteA, tamañoPA);
                    ImprimirVector(paqueteA);

                    break;
                case 2:
                    System.out.println("Introduce la capacidad del paquete b:");
                    //tamaño paquete b
                    int tamañoPB = (int) (entrada.nextInt());
                    //paquete b con su tamaño
                    String paqueteB[] = new String[tamañoPB];
                    LLenarVector(paqueteB, tamañoPB);
                    ImprimirVector(paqueteB);
                    break;
                case 3:
                    salir = true;
                    break;
                default:

            }

        }
    }

    public static void LLenarVector(String lista[], int n) {
        System.out.println("El paquete se esta llenando con el numero" + " " + n + " de presas.");
        for (int i = 0; i < lista.length; i++) {
            String presa = "1 nuget de pollo";
            lista[i] = (presa);
        }

    }

    public static void ImprimirVector(String lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("La presa :" + (i + 1) + " es un " + lista[i]);
        }
    }
}
