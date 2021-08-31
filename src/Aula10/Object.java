package Aula10;

//Declarando classe object
public class Object {
    private int posx;
    private int posy;
    private char direction;

//Declarando método construtor
    public Object(int x, int y, char direction){
        this.posx = x;
        this.posy = y;
        this.direction = direction;
    }

//Declarando método de alteração das coordenadas (posições) X e Y
    public void irA(int x, int y, char direction){
        this.posx = x;
        this.posy = y;
        this.direction = direction;
    }

//Declarando métodos de acesso e alteração de atributos privados
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}