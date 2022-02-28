import java.util.ArrayList;

public class CarrinhoDeCompras {

	ArrayList<Pizza> lista_pizzas = new ArrayList<>();

	public void adicionarPizza(Pizza pizza) {
		if (pizza.quantidade_ingredientes != 0)
			lista_pizzas.add(pizza);
	}

	public int getValorTotal() {
		int valorTotalPizzas = 0;
		for (int i = 0; i < lista_pizzas.size(); i++) 
			valorTotalPizzas += lista_pizzas.get(i).getPreco();
		return valorTotalPizzas;
	}

	public void ZerarCarrinhoDeCompras() {
		lista_pizzas.clear();
	}

}