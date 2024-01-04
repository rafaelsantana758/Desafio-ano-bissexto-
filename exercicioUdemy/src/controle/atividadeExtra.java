package controle;

import java.util.Scanner;

public class atividadeExtra {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite numero ");
	int numero = entrada.nextInt();
	
	if (numero >= 0 && numero <=10) {
		if (numero % 2 == 0) {
		System.out.println("o numero " + numero + " esta entre 0 e 10 e é um par ");
			} else {
			System.out.println("o numero "+ numero + " esta emntre 0 e 10 não é um par");
		} 
	} else {
			System.out.println("o numero " + numero + " não esta entre 0 e 10");
		}
		
	
	
	entrada.close();
}
}
