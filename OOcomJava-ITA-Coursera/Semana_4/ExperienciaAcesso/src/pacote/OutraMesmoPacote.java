package pacote;

public class OutraMesmoPacote {

		public void testeAcesso() {
			Referencia r = new Referencia();
			
			r.modificadorDefault = 0;		
			r.modificadorPublico = 0;
			r.modificadorProtegido = 0;
			
			//no mesmo pacote, apenas o método Privado não pode ser modificado
			r.modificadorPrivado = 0;
		}
		
}
