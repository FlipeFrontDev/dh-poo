package Aula11;

public class ContaCorrente extends Conta{

    //Criando atributo próprio da sub-classe
    private double valorAutorizado;

    //Criando construtor herdando atributos da superclasse Conta
    public ContaCorrente(double saldo, Cliente cliente) {
        super(saldo, cliente);
        this.valorAutorizado = this.saldo * 1.50;
    }

    //Sobreescrevendo métodos da super-classe abstrata
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        this.valorAutorizado = this.saldo * 1.50;
        System.out.println("Você depositou " + valor);
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo  && valor <= this.valorAutorizado){
            this.saldo -= valor;
            this.valorAutorizado += this.saldo;
            System.out.println("Você sacou: " + valor + ". Cheque especial: " + this.valorAutorizado);

        } else if (valor > this.saldo  && valor > this.valorAutorizado) {
            System.out.println("Limite não autorizado!");

        } else {
            this.saldo -= valor;
            System.out.println("Você sacou: " + valor);
            }
        }

    @Override
    public String mostrarSaldo() {
        return super.mostrarSaldo();
    }

    //Implementando método concreto da sub-classe
    public double getValorAutorizado() {
        return this.valorAutorizado;
    }
}
