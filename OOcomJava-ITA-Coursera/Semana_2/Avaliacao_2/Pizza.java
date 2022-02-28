import java.util.HashMap;

public class Pizza {
    int quantidade_ingredientes = 0;

    static HashMap<String, Integer> lista_ingredientes = new HashMap<>();

    private static void contablilizaIngrediente(String ingrediente) {
        // caso ingrediente se repita, soma +1
        if (lista_ingredientes.containsKey(ingrediente)) 
            lista_ingredientes.put(ingrediente, (lista_ingredientes.get(ingrediente)) + 1);
        // senao, adiciona ingrediente à lista
        else 
            lista_ingredientes.put(ingrediente, 1);
    }

    public void adicionaIngrediente(String ingrediente) {
        // a cada ingrediente adicionado, soma + 1

        this.quantidade_ingredientes++;

        contablilizaIngrediente(ingrediente);
    }

    public int getPreco() {
        if (this.quantidade_ingredientes <= 2)
            return 15;
        else if (this.quantidade_ingredientes > 2 && this.quantidade_ingredientes <= 5)
            return 20;
        else
            return 23;
    }

    // zera a lista do hashmap
    public static void ZerarListaIngredientes() {
        Pizza.lista_ingredientes.clear();
    }
}