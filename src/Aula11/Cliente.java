package Aula11;

public class Cliente {

    //Atributos da classe Cliente
    private String numCliente;
    private String sobrenome;
    private String cpf;
    private String conta;

    //Criando método construtor da sub-classe
    public Cliente(String numCliente, String sobrenome, String cpf, String conta) {
        this.numCliente = numCliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
    }


    //Criando modificadores de acesso
    public String getNumCliente() {
        return numCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getConta() {
        return conta;
    }
}
