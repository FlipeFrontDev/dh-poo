package com.company;
import java.util.Scanner;

public class ConverteRomanos {

    public static int converte() {

        Scanner ler = new Scanner(System.in);
        int total = 0;

        System.out.println("Por favor, digite um numeral romano equivalente entre 1 e 1000: ");
        String numeral = ler.nextLine();

        //Strings são iteraveis. Por isso é possível usar métodos de arrays nelas

        for (int i = 0; i < numeral.length(); i++) {

            //Verificando cada caracter de entrada
            switch (numeral.charAt(i)) {

                case 'I': total+=1;
                    break;

                //Condicionais ternarias que somam valor atual conforme seu antecessor, se houver

                case 'V':
                    total += (i > 0) && (numeral.charAt(i-1) == 'I') ? 3 : 5;
                    break;
                case 'X':
                    total += (i > 0) && (numeral.charAt(i-1) == 'I') ? 8 : 10;
                    break;
                case 'L':  total += (i > 0) && (numeral.charAt(i-1) == 'X') ? 30 : 50;
                    break;
                case 'C' :
                    total += (i > 0) && (numeral.charAt(i-1) == 'X') ? 80 : 100;
                    break;
                case 'D':
                    total += (i > 0) && (numeral.charAt(i-1) == 'C') ? 300 : 500;
                    break;
                case 'M' :
                    total += (i > 0) && (numeral.charAt(i-1) == 'C') ? 800 : 1000;
                    break;
                default:
                    System.out.println("O caracter " + numeral.charAt(i) + " é invalido");
            }
        }

        //Retornando somatório final após todas as iterações do laço

        return total;
    }

    public static void main(String[] args) {

       System.out.println((converte()));

    }
}
