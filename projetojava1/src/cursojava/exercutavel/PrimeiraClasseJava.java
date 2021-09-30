package cursojava.exercutavel;

public class PrimeiraClasseJava {

	/*Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		System.out.println("Meu primeiro programa em Java- do curso Formação Web");
		System.out.println("Java é orientado a objetos");
		
		/*Notas aprendendo a lidar com números*/
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
		System.out.println("Meu nome é: " + nome + " e meu CPF é : " 
		+ cpf + " Meu contato é: " + telefone +
		" e eu moro em: " + endereco + "e minha idade é: " + idade);
		
		/*Operações Lógicas If e Else*/
		
		int mediaAluno = 70;
		
		if (mediaAluno >= 70) {
			System.out.println("Parabens vc esta aprovado");
		}
		else	
		if (mediaAluno < 70) {
			System.out.println("Parabens vc esta reprovado");

			/*Condições Logicas com IF e ELSE*/
					int nota11 = 95;
					int nota21 = 95;
					int nota31 = 90;
					int nota41 = 90;
					int media = 0;

					media = (nota11 + nota21 + nota31 + nota41) / 4;

			/*Operações Logicas aninha: São operações dentro de operações
					
					if(media >= 50) {
						if(media >= 70) {
							if(media > 90) {
							System.out.println("Aluno está aprovado direto - Parabens pela nota: " + media);
							}else {
								System.out.println("Aluno está aprovado direto Sua Nota é: " + media);
							}
						}else {
							System.out.println("Aluno está em recuperação sua nota foi: " + media);
						}
					}else {
						System.out.println("Aluno reprovado direto sua nota foi: " + media);
					}*/	
				/*SWITCH CASE OPERAÇÕES EXATAS*/	
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
			
			/* Estrutura de repetição While e do While */

		int numero = 0;

		while (numero <= 3) {
			System.out.println("O Numero Atual é: " + numero);
			numero++;
		}
		/*-----------------------*/
		int numero2 = 0;
		do {/*Primerio Executa depois verificar*/
			System.out.println("O Numero Atual é: " + numero2);
			numero2++;
		} while (numero2 <= 60);
	
	}	
		
}
	
