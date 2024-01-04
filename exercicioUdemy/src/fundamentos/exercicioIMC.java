package fundamentos;

import java.util.Scanner;

public class exercicioIMC {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite sua altura :");
	double alt = entrada.nextDouble();
	
	System.out.println("Digite seu peso: ");
	double ps = entrada.nextDouble();
	
	double IMC = ps / Math.pow(alt, 2);
System.out.println(IMC);
	entrada.close();
	}
}
