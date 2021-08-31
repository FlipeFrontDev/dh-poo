package Aula10;

//Declarando sub-classe Spacechip
public class Spaceship extends Object{
    private double velocity;
    private int life = 5;

//Declarando método construtor que herda construtor padrão
    public Spaceship(int x, int y, char direction, double velocity){
        super(x, y, direction);
        this.velocity = velocity;
    }

//Declarando sobreescrita de método que altera função de atualização de coordenadas
//Condicional interna verifica se direção é alterada. Caso positivo, o objeto nave será deslocado para realizar curva
    @Override
    public void irA(int x, int y, char direction){
        if(this.getDirection() != direction) {
            System.out.println(girar(direction));
            this.setPosx(x);
            this.setPosy(y);
        } else {
            this.setPosx(x);
            this.setPosy(y);
        }
        System.out.println("Coordenadas atualizadas para: X=" + this.getPosx() + " Y=" + this.getPosy());
    }

    //Sobreescrevendo método toString para identificação do objeto

    @Override
    public String toString(){
        return "\n-------- Dados da aeronave --------" +
                "\nCoordenadas: " +
                "\nX: " + this.getPosx() +
                "\nY: " + this.getPosy() +
                "\nDireção: " + this.getDirection() +
                "\nVelocidade da nave: " + this.velocity;
    }

    //declarando método para realizar deslocamento nos eixos X ou Y conforme direção atual do objeto
    //Deslocamento visa realizar curva do objeto
    public String girar(char direction) {
        System.out.println("Fazendo curva da espaçonave!");

            switch (this.getDirection()) {

            //Caso a direção atual do objeto seja Sul ou Norte, o mesmo será deslocado no eixo X para realizar curva
                case 'S':
                case 'N':
                    if (direction == 'L') {
                        this.setPosx(this.getPosx() + 5);
                        break;
                    }
                    if (direction == 'O') {
                        this.setPosx(this.getPosx() - 5);
                        break;
                    }

            //Caso a direção atual do objeto seja Leste ou Oeste, o mesmo será deslocado no eixo Y para realizar curva
                case 'L':
                case 'O':
                    if (direction == 'N') {
                        this.setPosy(this.getPosy() + 5);
                        break;
                    }
                    if (direction == 'S') {
                        this.setPosy(this.getPosy() - 5);
                        break;
                    }
            }

        //Definição de nova direção informada na chamada do método e retorno de dados atualizados
        this.setDirection(direction);

        return "Direção atualizada para: " + this.getDirection() + ". Coordenadas atualizadas para: X=" + this.getPosx() + " Y=" + this.getPosy();
    }

    //Método restLife a ser utilizado posteriormente
    public int restLife(int value){
        this.life-=value;
        System.out.println("Você perdeu " + value + " vida(s). Vidas atuais: " + this.life);
        return this.life;
    }
}
