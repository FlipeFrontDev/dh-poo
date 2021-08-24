package Aula06;

public class Cachorro {

    private boolean apto;
    private String raca;
    private int idade;
    private int anoNasc;
    private int peso;
    private boolean chip;
    private boolean ferido;
    private String nome;

    public Cachorro() {}

    public Cachorro(int idade, int peso, boolean chip, boolean ferido) {
        this.idade = idade;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.apto = !this.ferido && this.peso > 5;
    }

    public Cachorro(String nome, String raca, int dataNasc, int idade, int peso, boolean chip, boolean ferido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNasc = dataNasc;
        this.idade = idade;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.apto = !this.ferido && this.peso > 5;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    public String getPrimeiroNome() {
        return nome;
    }

    public void setPrimeiroNome(String nome) {
        this.nome = nome;
    }

    public void adotar() {

        if (this.apto)
            System.out.println("O cão " + this.nome + ". Seja feliz!");
        else
            System.out.println("Não é possível adotar!");

    }
}
