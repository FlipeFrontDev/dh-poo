package Aula03;

//Importando classe de entrada de dados
import java.util.Scanner;

public class ExerciciosDesafio1 {

    public static void exibePrimos() {

        //Instanciando objeto e requisitando entrada de dados
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, digite um número inteiro positivo:");
        int n = ler.nextInt();

        //Verifica se quantidade de números primos desejada é maior ou igual a 1
        if (n >= 1) {

            //Inicia laço de repetição com dois contadores - um para comparar primos e outro para contar iterações
            for (int i = 2, j = 0; i <= 101; ++i) {

                //Verifica se um número é primo usando o crivo de erastótenes até a quantidade informada na entrada
                if (j < n && (i / 2 == 1 || i % 2 != 0) && (i / 3 == 1 || i % 3 != 0) && (i / 5 == 1 || i % 5 != 0) && (i / 7 == 1 || i % 7 != 0)) {
                    System.out.print(i + " ");

                    //Incrementa contador de comparação com quantidade informada na entrada
                    j++;
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
