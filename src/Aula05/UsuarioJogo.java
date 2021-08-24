package Aula05;

public class UsuarioJogo {

//Declara variáveis encapsuladas
    private String nome;
    private String nickName;
    private int pontuacao;
    private int nivel;

//    Declara método construtor
    public UsuarioJogo(String nome, String nickName) {

        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao = 0;
        this.nivel = 1;

    }

//    Declara métodos requisitados
    public String aumentarPontuacao(int pontos) {

        this.pontuacao += pontos;

        if ((this.pontuacao/500) >= this.nivel) {
            System.out.println(subirNivel());
        }

        return "Pontuação atualizada para: " + pontuacao;
    }

    public String subirNivel() {

        this.nivel = (this.pontuacao/500)+1;

        return "Parabéns!!! Você subiu de nível para: " + this.nivel;
    }

    public String bonus(int valorBonus) {
        this.pontuacao += valorBonus;
        subirNivel();

        return "Parabéns!!! Você subiu para o nível " + nivel;
    }

//    Declara métodos de acesso à variáveis encapsuladas
    public String getNome() {
        return nome;
    }

    public String getNickName() {
        return nickName;
    }

    public int getPontuacao() {
        return pontuacao;
    }

//    Atribui nivel a cada 500 pontos
    public int getNivel() {
        return nivel;
    }

//    Declara métodos de modificação necessária das variáveis encapsuladas
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
