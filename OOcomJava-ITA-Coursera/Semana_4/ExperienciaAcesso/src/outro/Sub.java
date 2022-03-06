package outro;

import pacote.Referencia;

public class Sub extends Referencia{
	
	public void testeAcesso() {
		modificadorDefault = 0;
		
		// apenas os métodos público e protegido podem ser modificados
		//quando se estende a classe de outro pacote
		modificadorPublico = 0;
		modificadorProtegido = 0;
		
		modificadorPrivado = 0;
	}

}
