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
		}
	}
	
