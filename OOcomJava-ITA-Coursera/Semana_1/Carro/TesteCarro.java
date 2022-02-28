import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarro {

	@Test
	void testAcelerar() {
		Carro novo = new Carro();
		novo.potencia = 10;
		novo.acelerar();
		assertEquals(10,novo.getVelocidade());
		
	}
	
	@Test
	void testFrear() {
		Carro novo = new Carro();
		novo.potencia = 10;
		novo.acelerar();
		novo.frear();
		assertEquals(5,novo.getVelocidade());
		
	}

	@Test
	void testFrearAteZero() {
		Carro novo = new Carro();
		novo.potencia = 10;
		novo.acelerar();
		novo.frear();
		novo.frear();
		novo.frear();
		novo.frear();
		assertEquals(0,novo.getVelocidade());
	}
}
