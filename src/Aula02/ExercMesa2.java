package Aula02;

import java.util.Scanner;

public class ExercMesa2 {

    public static String maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC) {

        //Faz atribuição inicial entre 2 numeros, e compara o maior dos dois com o terceiro
        int max = umNumeroA >= umNumeroB ? umNumeroA : umNumeroB;
        max = max >= umNumeroC ? max : umNumeroC;

        //Retorna valor máximo
        return "O maior número é: " + max;
    }

    public static void main(String[] args) {

        ////Instanciando objeto para entrada de dados no menu do exercício

        Scanner ler = new Scanner(System.in);
        System.out.println("\nSelecione uma opção: 1- comparar números, 2-Sair");
        int opcao = ler.nextInt();

        //Executará menu do exercício enquanto o usuario escolher opção 1

        while (opcao==1) {

            //Entrada de dados
            System.out.println("Por favor, digite 3 números inteiros positivos, sendo ao menos 1 diferente: ");

            //Declarando variáveis que recebem dados de entrada
            int umNumeroA  = ler.nextInt(), umNumeroB = ler.nextInt(), umNumeroC = ler.nextInt();

            //Verifica se todos os números são iguais e exibe nova chance de comparação
            if (umNumeroA == umNumeroB && umNumeroA == umNumeroB && umNumeroA == umNumeroC) {
                System.out.println("Por favor, reinsira os 3 números, mas digite ao menos 1 numero diferente!");
                umNumeroA  = ler.nextInt(); umNumeroB = ler.nextInt(); umNumeroC = ler.nextInt();
            }

            //Envia dados para validação
            System.out.println(maximoEntreTresNumeros(umNumeroA ,umNumeroB, umNumeroC));
            System.out.println("\nSelecione uma opção: 1- comparar números, 2-Sair");
            opcao = ler.nextInt();
        }
    }
}
