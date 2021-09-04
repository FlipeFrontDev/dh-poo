package Aula12;

public abstract class Funcionario {
  private String nome;
  private String sobrenome;
  private String cpf;
  private String email;
  private String matricula;
  private double salario;

  public Funcionario(String nome, String sobrenome, String cpf, double salario) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
  }

  public abstract void pagamento();

  @Override
  public String toString() {
    return  "Nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", cpf='" + cpf + '\'' +
            '.';
  }

  public double getSalario() {
    return salario;
  }

  public String getNome() {
    return nome;
  }
}
