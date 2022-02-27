public class Principal {
    public static void main(String[] args) {
       Aluno feliz = new Aluno();
       feliz.bim1 = 50;
       feliz.bim2 = 80;
       feliz.bim3 = 50;
       feliz.bim4 = 80;
       
       System.out.println(VerificadoraNota.mediaAluno(feliz));
       System.out.println(VerificadoraNota.passouDeAno(feliz));
       
    }
}
