package fundamentos;

public class DesafioAritimeticos {
public static void main(String[] args) {
	// int b = (int) se quiser deixar como um inetrio math.pow(a,e numero que vai ser elevado );
	int operacao1 = 6 * (3+2);
	int operacao2 =(int) Math.pow(operacao1, 2);
	int operacao3 = 3*2;
	int operacao4 = operacao2 / operacao3;
	System.out.println("Primeirra conta " + operacao4);
	
	int cont1 = (1-5) * (2-7);
	int cont2 = cont1 / 2;
	int cont3 = (int) Math.pow(cont2, 2);
	System.out.println("Segunda conta " + cont3);
	
	int contaFinal1 = operacao4 - cont3;
    int contaFinal2 = 10;
    int contaFinal3 = (int)Math.pow(contaFinal1, 3);
    int contaFinal4 = (int)Math.pow(contaFinal2, 3);
    int contaFinal5 = contaFinal3 / contaFinal4;
    System.out.println(contaFinal5);
    
	
	
}
}
