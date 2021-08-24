package Aula05;

public class Principal {

    public static void main(String[] args) {

        //      Instancia usuário 1
        UsuarioJogo user1 = new UsuarioJogo("Felipe", "Flipper");

        System.out.println("\n------Iniciando Jogo-----\n");

        System.out.println("Criando usuario1: " + user1.getNome());

        System.out.println(user1.aumentarPontuacao(300));
        System.out.println(user1.aumentarPontuacao(1900));

        System.out.println( "\nRelatório do jogador" +
                "\nNome: " + user1.getNome() +
                "\nNicknamne: " + user1.getNickName() +
                "\nPontuação: " + user1.getPontuacao() +
                "\nNivel: " + user1.getNivel());

        //      Instancia suário 2
        UsuarioJogo user2 = new UsuarioJogo("Yanna", "Yanner");

        System.out.println("\nCriando usuario2: " + user2.getNome());

        System.out.println(user2.aumentarPontuacao(800));
        System.out.println(user2.aumentarPontuacao(800));
        System.out.println(user2.bonus(800));

        System.out.println( "\nRelatório do jogador" +
                "\nNome: " + user2.getNome() +
                "\nNicknamne: " + user2.getNickName() +
                "\nPontuação: " + user2.getPontuacao() +
                "\nNivel: " + user2.getNivel());
    }
}
