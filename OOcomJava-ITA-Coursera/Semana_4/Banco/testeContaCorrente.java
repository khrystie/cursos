import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testeContaCorrente {

	ContaCorrente cc;
	
    @BeforeEach
    public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
    }

	@Test
	void testeDepositar() {
		assertEquals(200, cc.saldo);
	}

	@Test
	void testeSacar() {		
		int valorSacado = cc.sacar(50);
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}

	@Test
	void testeMaiorDoQueOSaldo() {		
		int valorSacado = cc.sacar(50);
		assertEquals(150, cc.saldo);
		assertEquals(50, valorSacado);
	}

}
