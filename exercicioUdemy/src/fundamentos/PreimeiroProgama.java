package fundamentos;

import java.util.Scanner;

public class PreimeiroProgama {
public static void main(String[] args) {
	/*String rafa = "primeiro programa ";
	System.out.println("primeiro programa ".codePointAt(1));// esse progama esta errado 
	System.out.println("primeiro programa ".charAt(2));// esse progama esta errado 
	System.out.println("primeiro programa ".concat("rafael"));// para concatenar frases no casa juntar palavras ou frases 
	System.out.println("primeiro programa ".compareTo(rafa));// esse metodo é para comparar string e ze der 0 é pq são iguais 
	System.out.println("primeiro programa ".compareToIgnoreCase(rafa)); 
	System.out.println("primeiro programa ".); 
	System.out.println("primeiro programa ".); */
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite seu nome ");
	String nome = entrada.nextLine();
	
	System.out.println("digite seu sobrenome ");
	String sobrenome = entrada.nextLine();
	
	System.out.println("digite sua idade");
	int idade = entrada.nextInt();
	
	System.out.printf("%s %s tem %d anos.%n", nome  , sobrenome, idade);
	
	// FUNDAMENTOS CONVERSÃO TIPOS PRIMITIVOS 
	double a = 1 ; // double é ponto flutuante mas como ele é mair neste caso a conversão é do tipo implicita 
	System.out.println(a);
	float b = (float) 1.123456788888; // float tmb é ponto flutuante porém o numero que ele está é maior então a conversão é de forma explicita (CAST)
	System.out.println(b); // uma das formas de converter é colocar o tipo () para falar para o java converter o tipo mesmo que perca dados 
	entrada.close();
}
}
