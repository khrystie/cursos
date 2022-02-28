
public class Carro {

    int potencia;
    int velocidade;
    String nome;

    // Carro (int velocidade, String nome){ //O Construtor tem o mesmo nome da Classe
    //     this.potencia = 0; //this referencia os atributos ou métodos da classe
    //     this.velocidade = velocidade;
    //     this.nome = nome;
    //     //Construtor não precisa ter return, ao contrário do método normal
    // }
    
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