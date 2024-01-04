package fundamentos;

import java.util.Scanner;

public class desafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);// entrada de dados no console 
		System.out.println("Digite seu Primeiro salario?");
		String salario1 = entrada.nextLine();
		
		System.out.println("Digite seu segundo salario?");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite seu terceiro salario?");
		String salario3 = entrada.nextLine();
		//O método nextLine() é um método da classe Scanner em Java que lê a entrada do usuário como uma string.
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		System.out.println((s1 + s2 + s3)/ 3);
		entrada.close();
	}

}
