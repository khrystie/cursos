import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TesteCarrinhoDeCompras {
	static Pizza p0 = new Pizza();
	static Pizza p1 = new Pizza();
	static Pizza p2 = new Pizza();
	static Pizza p3 = new Pizza();

    @BeforeClass
    public static void IngredientesDasPizzas() {
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("cream cheese");
				
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("cream cheese");
		p2.adicionaIngrediente("mussarela");
		
		p3.adicionaIngrediente("frango");
		p3.adicionaIngrediente("cream cheese");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("milho");
		p3.adicionaIngrediente("bacon");
	    p3.adicionaIngrediente("azeitona");
	    
    }
    
	@Test
	public void SomaDeTodasAsPizzas() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);

	    assertEquals(58,carrinho.getValorTotal());
	}
	
	@Test
	public void VerificarSeAceitaAdicionarAoCarrinhoPizzaSemIngredientes() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarPizza(p0);
		carrinho.adicionarPizza(p1);
		carrinho.adicionarPizza(p2);
		carrinho.adicionarPizza(p3);
		//assertEquals(0,carrinho.getValorTotal()); 
		
		assertEquals(3, Pizza.lista_ingredientes.size()/2); //dividido por dois pois  lista_ingredientes.size() retorna o key e value
		
	}


}