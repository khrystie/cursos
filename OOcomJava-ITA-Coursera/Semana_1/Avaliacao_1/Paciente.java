
public class Paciente {
	double peso=0;
	double altura=0;

	public double calcularIMC() {
		double imc=0;
		imc = peso / (altura*altura);
		
		return imc;
	}
	
	public String diagnostico() {
		String diagnostico = "";
		
		if(calcularIMC()<16) {
			diagnostico = "Baixo peso muito grave";
		} else if(calcularIMC()<=16.99) {
			diagnostico = "Baixo peso grave";
		} else if(calcularIMC()<=18.49) {
			diagnostico = "Baixo peso";
		} else if(calcularIMC()<=24.99) {
			diagnostico = "Peso normal";
		} else if(calcularIMC()<=29.99) {
			diagnostico = "Sobrepeso";
		} else if(calcularIMC()<=34.99) {
			diagnostico = "Obesidade Grau I";
		} else if(calcularIMC()<=39.99) {
			diagnostico = "Obesidade Grau II";
		} else if(calcularIMC()>=40) {
			diagnostico = "Obesidade Grau III";
		}
		
		return diagnostico;
	}
}
