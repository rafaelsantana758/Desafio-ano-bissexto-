package fundamentos;

public class desafioLogicos {
public static void main(String[] args) {
	boolean trabalho1 = false ;
	boolean trabalho2 = false;
	
	boolean comproutv50 = trabalho1 && trabalho2 ;
	boolean comprouyv32 = trabalho1 ^ trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;
	// Operador unario
	boolean maisSaudavel = !comprouSorvete; // ! isso negação lógica 
	
	
	System.out.println("compro tv 50 ? " + comproutv50);
	System.out.println("comprou tv 32 ?  " + comprouyv32);
	System.out.println("comprou sorvete ? " + comprouSorvete);
	System.out.println("mais saudaveln ? " +  maisSaudavel);
}
}
