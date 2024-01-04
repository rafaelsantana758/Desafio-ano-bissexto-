package controle;

import java.util.Scanner;

public class DesafioWhille {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		// while uma estrutura de repetição
		while (nota != -1) { // != isso é diferente nota é diferente de -1
			System.out.print("Informe  a nota: (ou -1 p/ sair)");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}else  if (nota != -1) {
			System.out.println("nota invalida !!!!!!!!!!!!!!!!!!!");
			}
		}
// calcular a média 
		double media = total / quantidadeDeNotas;
		System.out.println("media = " + media);
		entrada.close();
	}
}
