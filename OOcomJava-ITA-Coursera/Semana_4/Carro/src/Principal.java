
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB", 8, 140));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica("CarroC", 1.7, 100));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica("CarroD", 1.4, 110));
		corridaDaAmizade.umDoisTresEJa();
		
	}

}
