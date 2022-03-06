package outro;
import pacote.Referencia;

public class Outra {

	public void testeAcesso() {
		Referencia r = new Referencia();
		
		r.modificadorDefault = 0; 
	
		//em outro pacote, é possível modificar apenas o método público
		
		r.modificadorPublico = 0;
		r.modificadorProtegido = 0;
		r.modificadorPrivado = 0;
	}

}
