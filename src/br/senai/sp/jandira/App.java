package br.senai.sp.jandira;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String [] frutas = {"uva", "pera", "maça", "banana"};

        System.out.println("==============================================");
        System.out.println("                     BEM VINDO                ");
        System.out.println("==============================================");

        for(int i = 0; i < frutas.length; i++){
            System.out.println("Fruta " + (i + 1) + ": "+frutas[i]);

        }

        System.out.println("Qual fruta deseja comprar?");

        String opcao = teclado.next();

        boolean frutaDisponivel = false;

        for (int i = 0; i < frutas.length; i++){

            if (opcao.equals(frutas[i])) {
                System.out.println("Temos esta fruta");
                frutaDisponivel = true;

            }
        }
        if (!frutaDisponivel) {
            System.out.println("Não temos essa fruta");
        }


    }

}
