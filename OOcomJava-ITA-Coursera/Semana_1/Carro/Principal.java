
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Carro c1 = new Carro();
         c1.potencia = 10;
         c1.nome = "Corcel";
         c1.velocidade = 0; //questõa de "boas práticas"


         c1.acelerar();
         c1.acelerar();
         c1.acelerar();
         c1.frear();
         
         Carro c2 = new Carro();
         c2.potencia = 15;
         c2.nome = "Carango";
         c2.velocidade = 0;
         
         c2.acelerar();
         c2.acelerar();

         Carro c3 = new Carro();
         c3.potencia = 10;
         c3.nome = "Corsel";
         c3.velocidade = 0;

         c1.imprimir();
         c2.imprimir();
         c3.imprimir();
	}

}
