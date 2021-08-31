package Aula10;


//Declarando sub-classe Asteroid
public class Asteroid extends Object{
    private int danos;


//Declarando método construtor da classe, que herda o construtor
    public Asteroid(int x, int y, char direction, int danos) {
        super(x, y, direction);
        this.danos = danos;
    }

//Declarando método de alteração de coordenadas e exibe mensagem com os novos dados
    public void irA(int x, int y, char direction){
        this.setPosx(x);
        this.setPosy(y);
        this.setDirection(direction);
        System.out.println("Coordenadas atualizadas para: X=" + this.getPosx() + " Y=" + this.getPosy());
    }

//Declarando métodos de acesso e alteração de atributos privados

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }
}
