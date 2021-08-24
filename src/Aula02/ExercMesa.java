package Aula02;

import java.util.Scanner;

public class ExercMesa {

    public static Boolean verPrimo() {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo acima de 1: ");
        int num = ler.nextInt();

        if (num > 1) {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    System.out.println("Não primo!");
                    return false;
                }
            }
        }
        System.out.println("É primo!");
        return true;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("\nSelecione uma opção: 1- comparar números, 2-Sair");
        int opcao = ler.nextInt();

        while (opcao==1) {
            System.out.println(verPrimo());
            System.out.println("\nSelecione uma opção: 1- comparar números, 2-Sair");
            opcao = ler.nextInt();
        }
    }
}