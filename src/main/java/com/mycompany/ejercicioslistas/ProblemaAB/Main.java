/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioslistas.ProblemaAB;

import static com.mycompany.ejercicioslistas.ProblemaAB.EjercicioKFC.ImprimirVector;
import static com.mycompany.ejercicioslistas.ProblemaAB.EjercicioKFC.LLenarVector;
import java.util.Scanner;

/**
 *
 * @author magnuel
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
EjercicioKFC nuevo1 = new EjercicioKFC();
DiagonalesTRaspuestas nuevo2 = new DiagonalesTRaspuestas();

        
        while (!salir) {

            System.out.println("1. Ejercicio KFC");
            System.out.println("2. Diagonales TRaspuestas");
            System.out.println("3. Salir");

            System.out.println("Elija una opción:");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                   nuevo1.PaqueteAB();

                    break;
                case 2:
                    nuevo2.GenerarMaTRIZ();
                    
                    break;
                case 3:
                    salir = true;
                    break;
                default:

            }

        }
    }
}
