package pacote;

public class Referencia {
	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	//Quais podem ser modificadas na própria classe?
	public void testeAcesso() {
		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		modificadorPrivado = 0;
	}
}
