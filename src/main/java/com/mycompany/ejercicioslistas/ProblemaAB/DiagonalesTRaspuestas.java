/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioslistas.ProblemaAB;

import java.util.Scanner;

/**
 *
 * @author magnuel
 */
public class DiagonalesTRaspuestas {

    public static void GenerarMaTRIZ() {
        System.out.println("Ingresa el valor del tamaño para la matriz:");
        Scanner entrada = new Scanner(System.in);
        int x = 1;
        int n = entrada.nextInt();
        int a = 1, b = n - 1;
        int f = 2;
        int matriz[][] = new int[n][n];

        //llenamos las diagonales de la matriz
        for (int fila = 0; fila < matriz.length; fila++, a++, b--, f++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (fila == columna) {
                    matriz[fila][columna] = x++;

                    matriz[fila][b] = a;

                }

            }
        }
        llenar1(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("|" + matriz[i][j] + "| \t");

            }
            System.out.println("\n");
        }

    }

    public static void llenar1(int matriz[][]) {

        int valor = 1;
        int n1 = 0;
        int n2 = 0;
        int flag = 2;
        int n3 = 0;
        int n4 = matriz.length - 1;
        int n5 = matriz.length - 1;

        for (int fila = n1; fila < matriz.length; fila++, n1++) {
            for (int columna = flag + n1; columna < matriz.length - (2 + n1); columna++) {

                matriz[fila][columna] = valor;
            }
        }
        for (int fila = n2; fila < matriz.length; fila++, n2++, n4--) {
            for (int columna = flag + n2; columna < matriz.length - (2 + n2); columna++) {

                matriz[n4][columna] = valor;
            }

        }
        for (int fila = flag; fila < matriz.length - 2; fila++, n3++) {
            for (int columna = 0; columna == 0; columna++) {
                matriz[fila][columna] = valor;

            }

        }
        for (int fila = flag; fila < matriz.length - 2; fila++, n3++) {
            for (int columna = n5; columna == n5; columna++) {
                matriz[fila][columna] = valor;

            }

        }

    }
}
