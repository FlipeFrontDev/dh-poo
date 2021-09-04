package Aula12;

public class Principal {
    public static void main(String[] args){
        Empresa dh = new Empresa("DH", "68525");
        Funcionario funcionario1 = new Gerente("José", "Silva", "5555", 1000);
        dh.cadastrar(funcionario1);
        dh.listar();
        System.out.println(dh);

        dh.cadastrar(funcionario1);
        dh.listar();
        dh.remover(funcionario1);
        dh.listar();
    }
}
