package fundamentos;


import java.util.Scanner;

public class desafioCalculadora {
public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);

System.out.print("digite primeiro numero  ");
double primeiro = entrada.nextDouble();

System.out.print("dogite segundo numero ");
double segundo = entrada.nextDouble();

System.out.print("digite o tipo de operação ");
String operacao = entrada.next();

double resultado = "+".equals(operacao) ? primeiro + segundo : 0;
resultado = "-".equals(operacao) ? primeiro - segundo : resultado;
resultado = "*".equals(operacao) ? primeiro * segundo : resultado;
resultado = "/".equals(operacao) ? primeiro / segundo : resultado;
resultado = "%".equals(operacao) ? primeiro % segundo : resultado;

System.out.printf ( "%.2f  %S  %.2f = %.2f",primeiro,operacao,segundo,resultado);
entrada.close();

	
	
	
  }
}
