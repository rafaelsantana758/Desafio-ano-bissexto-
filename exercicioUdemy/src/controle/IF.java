package controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Informe a média:");
		double media = entrada.nextDouble();
		// if (media <= 10 && media>=7) INVERTI PRA VER SE DAVA CERTO TMB
		if (media >= 7 && media <= 10) {
			System.out.println("APROVADO");
			System.out.println("PARABENS");
		}
		if (media < 7 && media >= 4.5)
			System.out.println("Recuperação");
		boolean criterioReprovacaoAtingindo = media < 4.5 && media >= 0;
		if (criterioReprovacaoAtingindo) {
			System.out.println("REPROVADOOOO");
		}

		entrada.close();
	}
}
