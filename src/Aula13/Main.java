package Aula13;

public class Main {

  public static void main(String[] args) {

    Pimentao p1 = new Pimentao();
    p1.setPeso(200);
    p1.setColor("Amarelo");

    Pimentao p2 = new Pimentao();
    p2.setPeso(150);
    p2.setColor("Vermelho");

    if (p1.compareTo(p2) > 0) {
      System.out.println("O pimentão amarelo é maior que o vermelhor!");
    } else if (p1.compareTo(p2) < 0) {
      System.out.println("O pimentão amarelo é menor que o vermelhor!");
    } else {
      System.out.println("O pimentão amarelo é igual ao vermelhor!");
    }
  }
}
