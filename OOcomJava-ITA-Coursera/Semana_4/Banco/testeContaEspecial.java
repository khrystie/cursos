import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testeContaEspecial extends testeContaCorrente{

    @BeforeEach
    public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
    }

    @Test
	public void testeMaiorDoQueOSaldo() {		
		int valorSacado = cc.sacar(350);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}
    
    @Test
	public void SaqueMaiorDoQueOSaldoDentroDoLimite() {		
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(valorSacado, 250);
	}
    
}
