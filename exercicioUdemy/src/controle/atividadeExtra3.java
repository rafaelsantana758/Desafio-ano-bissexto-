package controle;

import java.util.Scanner;

public class atividadeExtra3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("nota parcial 1 : ");
		Double nota1 = entrada.nextDouble();

		System.err.println("nota parcial 2 ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("sua media foi " + media + " e voce foi aprovado ");
		} else if (media >= 4) {
			System.out.println("sua media foi " + media + " e voce esta em recuperção ");
		} else {
			System.out.println("sua media foi " + media + " e voce esta reprovado ");
		}
		entrada.close();
	}
}
