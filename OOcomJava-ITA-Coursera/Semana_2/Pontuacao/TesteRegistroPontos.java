import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistrarPontos rp = new RegistrarPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos,5);
		
	}
	@Test
	void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistrarPontos rp = new RegistrarPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos,25);
		
	}
	@Test
	void pontosCriarrBonusDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia =3;
		RegistrarPontos rp = new RegistrarPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos,15);
		
	}
	@Test
	void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia =2;
		RegistrarPontos rp = new RegistrarPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos,50);
		
	}

}
