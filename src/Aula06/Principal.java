package Aula06;

public class Principal {

    public static void main(String[] args) {

//        Impressora impressora = new Impressora("epon", "wifi", LocalDate.of(2020, 8, 20));
//        impressora.setFolhasDisponiveis(200);
//        impressora.imprimir("Olá! mundo!");
//        System.out.println(impressora.getFolhasDisponiveis());

        Cachorro cao1 = new Cachorro(15, 6, true, false);
        cao1.adotar();

    }
}
