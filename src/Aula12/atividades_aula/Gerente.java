package Aula12;

public class Gerente extends Funcionario{
  private double bonus;

  public Gerente(String nome, String sobrenome, String cpf, double salario) {
    super(nome, sobrenome, cpf, salario);
  }

  @Override
  public void pagamento() {
    double valor = getSalario() +  this.bonus;
  }
}
