package Aula11;

public class Main {

    public static void main(String[] args) {

        //Criando novo objeto cliente
        Cliente cliente1 = new Cliente("00001", "Silva", "999.999.999-99", "01");

        /*Instanciando novo objeto conta corrente com objeto cliente1 vinculado que, por ser do tipo Conta, exigirá
        casting para uso de métodos das sub-classes*/
        Conta conta1 = new ContaCorrente(1000, cliente1);

        //Mostrando dados da conta corrente
        System.out.println("Dados conta corrente");

        //Mostrando dados da conta com método toString() sobreescrito na super-classe abstrata
        System.out.println("\n" + conta1.toString() + "\n");

        //Invocando método mostrarSaldo
        System.out.println(conta1.mostrarSaldo());

        //Depositando novo valor a ser incrementado no saldo da C/C
        conta1.depositar(500);

        //Imprimindo saldo novamente para verificar o valor incrementado/ decrementado
        System.out.println(conta1.mostrarSaldo());

        /*Usando casting para invoca método getValorAutorizado da classe filha ContaCorrente que não existe na
        super-classe*/
        System.out.println("Limite de crédito: " + (((ContaCorrente)conta1).getValorAutorizado()));

        //Invocando método sacar que decrementa o saldo
        conta1.sacar(2000);

        //Imprimindo saldo novamente para verificar o valor incrementado/ decrementado
        System.out.println(conta1.mostrarSaldo());

        System.out.println("\nDados conta Poupança");

        /*Instanciando novo objeto conta poupança que, por ser do tipo Conta, exigirá casting para uso de métodos
        das sub-classes*/
        Conta conta2 = new ContaPoupanca(500, cliente1);

        /*Mostrando dados da conta poupança vinculada à C/C com método toString() sobreescrito na super-classe
        abstrata e que pode serherdado pelas sub-classes*/
        System.out.println("\n" + conta2.toString() + "\n");

        //Imprimindo saldo novamente para verificar o valor incrementado/ decrementado
        System.out.println("Poupança: " + conta2.mostrarSaldo());

        /*Usando casting para invoca método cobrarJuros da classe filha ContaPoupanca que não existe na
        super-classe*/
        System.out.println("Cobrando juros: " + ((ContaPoupanca)conta2).cobrarJuros());
        //Imprimindo saldo novamente para verificar o valor incrementado/ decrementado
        System.out.println(conta2.mostrarSaldo());
    }
}
