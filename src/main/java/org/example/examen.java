package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class examen {

    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        String todo = "pat";
        int tam = todo.length();
        Random random = new Random();
        int al = random.nextInt(tam);
        String eleccion = "";
        eleccion += todo.charAt(al);

        String p = "PIEDRA";
        String a = "PAPEL";
        String t = "TIJERA";
        int ronda = 0;

        int punto = ronda + 1;
        int puntomaquina = ronda + 1;

        System.out.println("BIENVENIDO A PIEDRA / PAPEL / TIJERA");
        System.out.println("*************************************");
        System.out.println("A continuacion selecciona tu opcion");
        System.out.println("*************************************");
        System.out.println("p) PIEDRA");
        System.out.println("a) PAPEL");
        System.out.println("t) TIJERA");
        System.out.println("*************************************");
        System.out.println("Por si no has jugado nunca:");
        System.out.println("Papel (a) gana a piedra (p).");
        System.out.println("Piedra (p) gana a tijera (t).");
        System.out.println("Tijera (t) gana a papel (a)");

        do {
            System.out.print("SELECCIONA UNO: ");
            String select = entrada.next();

            switch (select) {
                case "p":
                    System.out.println("haz seleccionado piedra");
                    System.out.println("LA maquina selecciono: " + eleccion);

                    if ("p" == eleccion) {
                        System.out.println("empate");
                    } else if (eleccion == "a") {
                        System.out.println("GANA MAQUINA: " + puntomaquina);
                    } else if (eleccion == "t") {
                        System.out.println("JUGADOR GANA: " + punto);
                    }
                    break;
                case "a":
                    System.out.println("haz seleccionado papel");
                    System.out.println("LA maquina selecciono: " + eleccion);
                    break;
                case "t":
                    System.out.println("haz seleccionado tijera");
                    System.out.println("LA maquina selecciono: " + eleccion);
                    break;
                default:
                    System.out.println("**ERROR NO VALIDO SIMBOLO INEXISTENTE**");

            }
        }while (punto == 3 || puntomaquina == 3) ;
            if (punto == 3) {
                System.out.println("EL JUGADOR GANA CON " + punto);
            } else if (puntomaquina == 3) ;
            {
                System.out.println("LA MAQUINA GANA CON " + puntomaquina);

            }
    }







    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu año de nacimiento:");
        int anyo = entrada.nextInt();
        int edad = 0;

        if (anyo <= 1900){
            System.out.println("No se aceptan años menores al 1900");
        }
        else {
            for (int i = anyo; i < 2025 ; i++) {
                System.out.println( i + " - edad: " );
            }
        }

    }
}

