public class Somador {
    String nome;
    int valorInstancia=0;
    static int valorEstatica=0;

    void somar(){
        valorInstancia++;
        valorEstatica ++;
    }

    void imprimir(){
        System.out.println("O nome do somador é " + nome + ". O valor da instânica é " +valorInstancia + ". O valor da estática é " +valorEstatica + ".\n");
    }
}
