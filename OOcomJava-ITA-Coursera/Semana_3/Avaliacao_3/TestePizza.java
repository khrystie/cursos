import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestePizza {

    @Before
    public void before() {
        Pizza.ZerarListaIngredientes();
    }
    
	@Test
	public void valorDaPizzaDeAcordoComQuantidadeDeIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("cream cheese");
				
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("cream cheese");
		p2.adicionaIngrediente("mussarela");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("frango");
		p3.adicionaIngrediente("cream cheese");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("milho");
		p3.adicionaIngrediente("bacon");
	    p3.adicionaIngrediente("azeitona");
		
		assertEquals(15, p1.getPreco());
		assertEquals(20, p2.getPreco());
		assertEquals(23, p3.getPreco());
	}
	
	@Test
	public void registroDaQuantidadeDeIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("cream cheese");
				
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("cream cheese");
		p2.adicionaIngrediente("mussarela");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("frango");
		p3.adicionaIngrediente("cream cheese");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("milho");
		p3.adicionaIngrediente("bacon");
		p3.adicionaIngrediente("azeitona");
		
		assertEquals(Integer.valueOf(3), Pizza.lista_ingredientes.get("frango"));
		assertEquals(Integer.valueOf(3), Pizza.lista_ingredientes.get("cream cheese"));
		assertEquals(Integer.valueOf(2), Pizza.lista_ingredientes.get("mussarela"));
		assertEquals(Integer.valueOf(1), Pizza.lista_ingredientes.get("milho"));
		assertEquals(Integer.valueOf(1), Pizza.lista_ingredientes.get("bacon"));
		assertEquals(Integer.valueOf(1), Pizza.lista_ingredientes.get("azeitona"));
	}


}