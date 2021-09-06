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
		}
	}
	
