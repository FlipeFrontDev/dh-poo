package src.Aula13;

import java.lang.*;

public class Pimentao implements Comparable {

  private String tipo;
  private String color;
  private double tamanho;
  private double peso;

  public Pimentao() {
  };

  public int compareTo(Object obj) {

    Pimentao p2 = (Pimentao) obj;
    int resposta = 0;

    if (this.getPeso() > p2.getPeso())
      resposta = 1;

    if (this.getPeso() < p2.getPeso())
      resposta = -1;

    return resposta;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

}