package Aula03;

import java.util.Scanner;

public class ExercicioDesafio1b {

    public static void exibePrimos() {

        //Instanciando objeto e requisitando entrada de dados
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, digite um número inteiro positivo:");
        int n = ler.nextInt();

        //Verifica se quantidade de números primos desejada é maior ou igual a 1
        if (n >= 1) {
            int counter = 0;

            //Inicia laço de repetição - um para comparar primos e outro para contar iterações
            for (int i = 2; i <= 101; i++) {
                int divisores = 0;

                //Verifica se um número é primo usando condicionais simples
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0)
                        divisores += 1;
                    if (divisores > 1)
                        break;
                }

                //Imprime a quantidade de numeros solicitados na entrada de dados
                if(divisores < 2 && counter < n) {
                    counter++;
                    System.out.print(i + " ");
                }
            }

            //Retorna mensagem de erro caso quantidade de números seja inferior a 1
        } else {
            System.out.println("Por favor, digite um numero inteiro positivo acima de 1 como intervalo.");
        }
    }

    public static void main(String[] args) {


        //Instancia objeto de leitura do menu e requisita entrada do usuário
        Scanner ler = new Scanner(System.in);
        System.out.println("\nSelecione uma opção: 1- Mostrar números primos, 2-Sair");
        int opcao = ler.nextInt();

        //Executa comparação de números primos e retorna ao menu enquanto o usuário quiser
        while (opcao==1) {
            exibePrimos();
            System.out.println("\nSelecione uma opção: 1- comparar números, 2-Sair");
            opcao = ler.nextInt();
        }
    }
}
