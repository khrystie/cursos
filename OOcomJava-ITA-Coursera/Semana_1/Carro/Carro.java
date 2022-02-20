
public class Carro {

    int potencia;
    int velocidade;
    String nome;

    void acelerar(){
        velocidade += potencia;
    }
    void frear(){
        velocidade *= 0.5; 
    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro " +nome+ " está a velocidade de " +getVelocidade() + "km/h");
    }

}