package Aula01;

import java.util.Locale;
import java.util.*;

public class MesaDefMascotes {

    private String nome, som;
    private int idade;
    private float consumo;

    //Declarando construtor da classe

    public void constructor(String nome, int idade, float consumo, String som) {

        this.nome = nome;
        this.idade = idade;
        this.consumo = consumo;
        this.som = som;

    }

    //Definindo métodos de atribuicao e acesso a atributos encapsulados

    public String getNome() {
        return nome;
    }

    public String getSom() {
        return som;
    }

    public int getIdade() {
        return idade;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    //Declarando método de cadastro

    public static String cadastraAnimal() {

        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        //Instanciando novo objeto Animal

        MesaDefMascotes animal = new MesaDefMascotes();

        //Atribuindo e recuperando valores através dos métodos get e set da classe

        System.out.println("Digite o nome do animal:");
        animal.setNome(ler.nextLine());

        System.out.println("Que som o seu pet faz?");
        animal.setSom(ler.nextLine());

        System.out.println("Digite a idade do animal:");
        animal.setIdade(ler.nextInt());

        System.out.println("Qual o consumo do seu pet?:");
        animal.setConsumo(ler.nextFloat());

        return  ("\n----- Dados do seu pet -----") + "\n" +
                (animal.getNome() + " tem " + animal.getIdade() + " anos de vida, come " + animal.getConsumo() +
                        "Kg e faz " + animal.getSom() + ".");

    }

    public static void main(String[] args) {

        //Definindo menu do exercicio

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma opção: 1-Cadastrar animal, 2- Sair");
        int opcao = ler.nextInt();

        while (opcao == 1) {

            System.out.println(cadastraAnimal());
            System.out.println("\nDigite uma opção: 1-Cadastrar animal, 2- Sair\n");
            opcao = ler.nextInt();

        }

        System.out.println("\nOk, Até mais!");

    }
}

