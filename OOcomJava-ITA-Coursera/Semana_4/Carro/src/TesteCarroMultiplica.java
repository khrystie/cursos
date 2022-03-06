import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarroMultiplica {

CarroDeCorrida novo;
	
	@BeforeEach
	public void incializaCarro() {
		novo = new CarroMultiplica("teste", 1.5, 100);
	}
	
	@Test
	void testCarroParado() {
		assertEquals(0,novo.getVelocidade());
		
	}
	
	@Test
	void testAcelerarUmaVez() {
		novo.acelerar();
		assertEquals(10,novo.getVelocidade());
	}
	
	@Test
	void testAcelerarDuasVezes() {
		novo.acelerar();
		novo.acelerar();
		assertEquals(15,novo.getVelocidade());
	}
	
	@Test
	void testFrear() {
		novo.acelerar();
		novo.frear();
		assertEquals(5,novo.getVelocidade());
		
	}

	@Test
	void testFrearAteZero() {
		novo.acelerar();
		novo.frear();
		novo.frear();
		novo.frear();
		novo.frear();
		assertEquals(0,novo.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for(int i=0; i<14; i++)
			novo.acelerar();
		assertEquals(100,novo.getVelocidade());
	}
}
