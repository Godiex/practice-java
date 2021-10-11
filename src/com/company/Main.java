package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("digite el numero de filas");
        int filas = lector.nextInt();
        System.out.println("digite el numero de columnas");
        int columnas = lector.nextInt();

        int [][] matriz1 = new int[filas][columnas];
        int [][] matriz2 = new int[filas][columnas];
        int [][] matriz3 = new int[filas][columnas];

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){

                boolean salir = false;
                int numeroParAleatorioEntreCeroYCien = (int) Math.round(Math.random() * 100);
                while(!salir){
                    if(numeroParAleatorioEntreCeroYCien % 2 != 0)
                        numeroParAleatorioEntreCeroYCien -= 1;
                    salir = true;
                }
                matriz1[i][j] = numeroParAleatorioEntreCeroYCien;

            }
        }

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){

                boolean salir = false;
                int numeroImparAleatorioEntreCeroYCincuenta = 2;
                while(!salir){
                    numeroImparAleatorioEntreCeroYCincuenta = (int) Math.round(Math.random() * 100);
                    if (numeroImparAleatorioEntreCeroYCincuenta <= 50){
                        if(numeroImparAleatorioEntreCeroYCincuenta % 2 == 0){
                            numeroImparAleatorioEntreCeroYCincuenta -= 1;
                        }
                        salir = true;
                    }
                }
                matriz2[i][j] = numeroImparAleatorioEntreCeroYCincuenta;
            }
        }

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < filas; i++){
            System.out.println(" ");
            for (int j = 0; j < columnas; j++){
                System.out.print(matriz2[i][j] + " ");
            }
        }

    }


}
