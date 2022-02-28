
public class Principal {

	public static void main(String[] args) {

		// Cria 3 pizzas com ingredientes diferentes
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("cream cheese");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("milho");
		p2.adicionaIngrediente("cream cheese");
		p2.adicionaIngrediente("bacon");
		p2.adicionaIngrediente("azeitona");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("calabresa");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("catupiry");
		p3.adicionaIngrediente("cebola");
		p3.adicionaIngrediente("bacon");
		p3.adicionaIngrediente("champion");

	
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		// Adiciona essas Pizzas em um CarrinhoDeCompra
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);

		// Imprime o total do CarrinhoDeCompra
		System.out.println("Total de R$" + carrinho.getValorTotal() + "\n");

		// Imprime a quantidade utilizada de cada ingrediente
		// i = ingrediente, q = quantidade
		Pizza.lista_ingredientes.forEach((i, q)->System.out.println("Ingrediente: " + i + " / Quantidade: " + q));
	}

}