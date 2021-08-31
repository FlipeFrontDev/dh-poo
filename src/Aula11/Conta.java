package Aula11;

public abstract class Conta {

    //Atributos da super-classe abstrata Conta
    protected double saldo;
    private Cliente cliente;

    //Criando construtor da superclasse abstrata Conta
    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Criando métodos abstratos a serem obrigatoriamente sobrescritos pelas sub-classes
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    //Criando método concreto a ser herdado e usado opcionalmente pelas sub-classes
    public String mostrarSaldo(){
        return "Saldo atual: " + this.saldo;
    };

    //Criando modificadores de acesso
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*Sobreescrevendo método toString(), que pode ser opcionalmente usado pelas subclasses, para retornar dados dos
     objetos*/
    @Override
    public String toString() {
        return "Dados do cliente:" +
                "\nConta: " + getCliente().getConta() +
                "\nNumero cliente: " + getCliente().getNumCliente() +
                "\nCPF: " + getCliente().getCpf() +
                "\nSobrenome: " + getCliente().getSobrenome();
    }
}

