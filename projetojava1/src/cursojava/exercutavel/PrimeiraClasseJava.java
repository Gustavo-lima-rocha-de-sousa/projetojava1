package cursojava.exercutavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
	/*Main ? um metodo auto executavel em java
	public static void main(String[] args) {
		
		/*Escreve texto no console
		System.out.println("Meu primeiro programa em Java- do curso Forma??o Web");
		System.out.println("Java ? orientado a objetos");*/
		
		/*Notas aprendendo a lidar com n?meros
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("Media das notas = " + mediaFinal);*/
		
		/*Char representa uma letra
		char pessoaFeminino = 'F';
		if(pessoaFeminino == 'F') {
			System.out.println("Feminino");
		}else {
			System.out.println("Masculino");
		}*/			
		
		/*Concatenacao = Unir ou juntar dados*/
		
		/*String no java sempre sera texto de qual quer tamanho
		String nome = "Gustavo Lima";
		String cpf = "065.421.591-00";
		String telefone = "61 984042809";
		String endereco = "Santa Maria - DF";
		int idade = 21;
		System.out.println("Meu nome ?: " + nome + " e meu CPF ?: " 
		+ cpf + " Meu contato ?: " + telefone +
		" e eu moro em: " + endereco + " e minha idade ?: " + idade);*/
		
		/*Opera??es L?gicas If e Else
		
		int mediaAluno = 70;
		
		if (mediaAluno >= 70) {
			System.out.println("Parabens vc esta aprovado");
		}
		else	
		if (mediaAluno < 70) {
			System.out.println("Parabens vc esta reprovado");

			/*Condi??es Logicas com IF e ELSE
					int nota11 = 95;
					int nota21 = 95;
					int nota31 = 90;
					int nota41 = 90;
					int media = 0;

					media = (nota11 + nota21 + nota31 + nota41) / 4;*/

			/*Opera??es Logicas aninhadas: S?o opera??es dentro de opera??es
					
					if(media >= 50) {
						if(media >= 70) {
							if(media > 90) {
							System.out.println("Aluno est? aprovado direto - Parabens pela nota: " + media);
							}else {
								System.out.println("Aluno est? aprovado direto Sua Nota ?: " + media);
							}
						}else {
							System.out.println("Aluno est? em recupera??o sua nota foi: " + media);
						}
					}else {
						System.out.println("Aluno reprovado direto sua nota foi: " + media);
					}*/
				/*SWITCH CASE OPERA??ES EXATAS	
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
				}*/
			
			/* Estrutura de repeti??o While e do While 

		int numero = 0;

		while (numero <= 3) {
			System.out.println("O Numero Atual ?: " + numero);
			numero++;
		}
		-----------------------*/
		/*int numero2 = 0;
		do {/*Primerio Executa depois verificar
			System.out.println("O Numero Atual ?: " + numero2);
			numero2++;
		} while (numero2 <= 60);*/
		/* Estrutura de repeti??o FOR
		
		for(int numero3 = 0; numero3 <=10; numero3 ++) { 
			System.out.println("Numero Atual ? :" + numero3);
		}*/
		/* Estrutura de repeti??o FOR + brak (Parada)
		
		for(int numero4 = 0; numero4 <=10; numero4 ++) { 
			if(numero4 == 7 ) {
				System.out.println("Obaaaa, Encontrei o numero 7");
				System.out.println("Estou Parando de Executar...");
				break;
			}
		}*/
		/* Estrutura de repeti??o FOR + Continue
		
		for(int numero5 = 0; numero5 <=10; numero5 ++) { 
			if(numero5 == 3 || numero5 == 6 || numero5 == 9 ) {
				System.out.println("Obaaaa, Encontrei o numero: " + numero5);
				continue;
			}
		}*/
		
		/* Estrutura de repeti??o FOR + Continue
		
		for(int numero6 = 0; numero6 <=10; numero6 ++) { 
			if(numero6 == 3 || numero6 == 6 || numero6 == 9 ) {
				System.out.println("Obaaaa, Encontrei o numero: " + numero6);
				continue; 
				
			}else { ;
			 System.out.println("Achei todos os n?meros e estou encerrando o processo.");
			} break;
         }*/	
		/* M?dulo: Resto da Divis?o %
		
		double carro = 9;
		double pessoas = 2;
		
		double resto = carro % pessoas;
		
		System.out.println("Sobraram exatament: " + resto + " Carros no estoque." );*/
		/* Entrada de dados*/
		
		/* Entrada de dados Esquema de Carros*/
		
		String carros = JOptionPane.showInputDialog("Informe a Quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a Quantidade de pessoas?");
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero /pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis?o?");
			if (resposta ==0) {
				JOptionPane.showMessageDialog(null,"Divis?o para pessoas deu: " + divisao);
				
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis?o?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis?o ? " + resto);
				}
			}
			/* Entrada de dados Esquema de Notas*/
			String nota1 = JOptionPane.showInputDialog("Informe a Nota 1 ");
			String nota2 = JOptionPane.showInputDialog("Informe a Nota 2 ");
			String nota3 = JOptionPane.showInputDialog("Informe a Nota 3 ");
			String nota4 = JOptionPane.showInputDialog("Informe a Nota 4 ");
			
			double dNota1 = Double.parseDouble(nota1);
			double dNota2 = Double.parseDouble(nota2);
			double dNota3 = Double.parseDouble(nota3);
			double dNota4 = Double.parseDouble(nota4);
			
			double media = (dNota1 + dNota2 + dNota3 + dNota4) /4;
			
			if(media >= 50) {
				
				if(media >=70){
					JOptionPane.showMessageDialog(null, "Aluno Est? Aprovado com m?dia de : " + media);
				}else {
			JOptionPane.showMessageDialog(null, "Aluno em recupera??o com m?dia de : " + media);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Aluno est? reprovado com m?dia de : " + media);
			}	
				
	}	
		
}
	
