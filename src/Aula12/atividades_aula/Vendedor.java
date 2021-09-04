package Aula12;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    public double calcularComissao(int vendas){
        this.comissao = vendas * 50;
        return this.comissao;
    }

    @Override
    public void pagamento() {
        System.out.println("Seu pagamento será de: " + this.getSalario() + this.comissao);
    }
}
