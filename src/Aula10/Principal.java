package Aula10;

public class Principal {
    public static void main(String[] args) {

        //Instanciando objeto Spacechip que possui controle de tráfego
        Spaceship jumbo1 = new Spaceship(55, 88, 'N', 150);
        //Atualizando direção de navegação do objeto
        jumbo1.irA(108,150, 'L');

        //Instanciando objeto Asteroid que não possui controle de tráfego
        Asteroid n555 = new Asteroid(55,55, 'E', 300);
        // //Atualizando direção de deslocamento do objeto
        n555.irA(200,200, 'E');
    }
}