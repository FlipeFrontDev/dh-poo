package Aula12;

import java.util.ArrayList;

public class Empresa {
  private String nome;
  private String cnpj;
  private Funcionario funcionario;
  private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

  public Empresa(String nome, String cnpj){
    this.nome = nome;
    this.cnpj = cnpj;
  }

  public void cadastrar(Funcionario funcionario){
    listaFuncionario.add(funcionario);
    System.out.println("Funcinario foi cadastrado com sucesso!!!");
  }

  public void listar(){
    for(int i = 0; i < listaFuncionario.size(); i++){
      System.out.println(listaFuncionario.get(i));
    }
  }

  public void remover(Funcionario funcionario){
        if(listaFuncionario.remove(funcionario))
          System.out.println("Funcionario " + funcionario.getNome()  + " foi removido com sucesso!");
        else
          System.out.println("Exclusão não efetivada!");
  }

  @Override
  public String toString() {
    return "Empresa{" +
            "nome='" + nome + '\'' +
            ", cnpj='" + cnpj + '\'' +
            ", listaFuncionario=" + listaFuncionario +
            '}';
  }
}
