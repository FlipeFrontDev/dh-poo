package Aula02;

public class DadosPessoais {

    //Declarando função dados que retorna as iniciais e data de nascimento

    public static String dados(String nome, String sobrenome, String dataNascimento) {
        char var10000 = nome.charAt(0);
        return var10000 + " " + sobrenome.charAt(0) + " " + dataNascimento;
    }

    public static void main(String[] args) {

        //Chamando função dados passando nome, sobrenome e data de nascimento como argumentos

        System.out.println(dados("Felipe", "Oliveira", "07/09/1990"));

    }
}