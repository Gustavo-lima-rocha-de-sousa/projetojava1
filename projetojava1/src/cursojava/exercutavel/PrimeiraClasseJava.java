package cursojava.exercutavel;

public class PrimeiraClasseJava {

	/*Main � um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		System.out.println("Meu primeiro programa em Java- do curso Forma��o Web");
		System.out.println("Java � orientado a objetos");
		
		/*Notas aprendendo a lidar com n�meros*/
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("Media das notas = " + mediaFinal);
		
		/*Char representa uma letra*/
		char pessoaFeminino = 'F';
		if(pessoaFeminino == 'F') {
			System.out.println("Feminino");
		}else {
			System.out.println("Masculino");
		}			
		
		/*Concatenacao = Unir ou juntar dados*/
		
		/*String no java sempre sera texto de qual quer tamanho*/
		String nome = "Gustavo Lima";
		String cpf = "065.421.591-00";
		String telefone = "61 984042809";
		String endereco = "Santa Maria = DF";
		int idade = 21;
		System.out.println("Meu nome �: " + nome + " e meu CPF � : " 
		+ cpf + " Meu contato �: " + telefone +
		" e eu moro em: " + endereco + "e minha idade �: " + idade);
		
		/*Opera��es L�gicas If e Else*/
		
		int mediaAluno = 70;
		
		if (mediaAluno >= 70) {
			System.out.println("Parabens vc esta aprovado");
		}
		else	
		if (mediaAluno < 70) {
			System.out.println("Parabens vc esta reprovado");

			/*Condi��es Logicas com IF e ELSE*/
					int nota11 = 95;
					int nota21 = 95;
					int nota31 = 90;
					int nota41 = 90;
					int media = 0;

					media = (nota11 + nota21 + nota31 + nota41) / 4;

			/*Opera��es Logicas aninha: S�o opera��es dentro de opera��es
					
					if(media >= 50) {
						if(media >= 70) {
							if(media > 90) {
							System.out.println("Aluno est� aprovado direto - Parabens pela nota: " + media);
							}else {
								System.out.println("Aluno est� aprovado direto Sua Nota �: " + media);
							}
						}else {
							System.out.println("Aluno est� em recupera��o sua nota foi: " + media);
						}
					}else {
						System.out.println("Aluno reprovado direto sua nota foi: " + media);
					}*/	
				/*SWITCH CASE OPERA��ES EXATAS*/	
					int dia = 1
						;
					switch (dia) {
					case 1:
						System.out.println("Domingo");
						break;
					case 2:
						System.out.println("Segunda-Feira");
						break;
					case 3:
						System.out.println("Terca-Feira");
						break;
					default: System.out.println("Outro Dia");
						break;
						}
				}
			
			/* Estrutura de repeti��o While e do While */

		int numero = 0;

		while (numero <= 3) {
			System.out.println("O Numero Atual �: " + numero);
			numero++;
		}
		/*-----------------------*/
		int numero2 = 0;
		do {/*Primerio Executa depois verificar*/
			System.out.println("O Numero Atual �: " + numero2);
			numero2++;
		} while (numero2 <= 60);
	
	}	
		
}
	
