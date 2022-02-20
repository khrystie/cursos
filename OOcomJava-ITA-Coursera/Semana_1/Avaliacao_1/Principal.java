public class Principal {
	public static void main(String[] args) {

		Paciente paciente1 = new Paciente();
		paciente1.peso = 40;
		paciente1.altura = 1.7;
		
		Paciente paciente2 = new Paciente();
		paciente2.peso = 67;
		paciente2.altura = 1.63;
		
		Paciente paciente3 = new Paciente();
		paciente3.peso = 140;
		paciente3.altura = 1.7;

		System.out.println("Paciente 1 - IMC: " +  String.format("%.2f", paciente1.calcularIMC())+ " Diagnóstico: " + paciente1.diagnostico());
		System.out.println("Paciente 2 - IMC: " +  String.format("%.2f", paciente2.calcularIMC())+ " Diagnóstico: " + paciente2.diagnostico());
		System.out.println("Paciente 3 - IMC: " +  String.format("%.2f", paciente3.calcularIMC())+ " Diagnóstico: " + paciente3.diagnostico());
	}

}
