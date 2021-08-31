package Aula11;

public class ContaPoupanca extends Conta {

    //Atributo da sub-classe
    private double taxaJuros;

    //Criando construtor herdando atributos da superclasse Conta
    public ContaPoupanca(double saldo, Cliente cliente) {
        super(saldo, cliente);
        this.taxaJuros = 0.05;
    }

    //Sobreescrevendo métodos da super-classe abstrata
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Você depositou " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor >= this.saldo) {
            this.saldo -= valor;
            System.out.println("Você sacou " + valor);
        }
        System.out.println("Saldo insuficiente!");
    }

    @Override
    public String mostrarSaldo() {
        return super.mostrarSaldo();
    }

    //Implementando método concreto da sub-classe
    public double cobrarJuros(){
        return this.saldo += (this.saldo * this.taxaJuros);
    }
}