package fundamentos;

public class Inferencia {
public static void main(String[] args) {
	double a = 4.5; // declaração e inicialização da variavel
	System.out.println(a);
	double d; // variável foi declarada
	d = 123.65; // variável foi inicializada
	System.out.println(d); //variavel foi usada
	
	
var b = 4.5; // VAR recebe texto e numero  no var não da para declarar e depois inicializar assim que vc declara tem que inicializar pra ela saber se e tipo texto ou numero 
// atraves da inicialização o VAR consegue inferir qual é  o tipo de dados associado aquela variavel 
System.out.println(b);
var c = "texto";
System.out.println(c);
}
}
