package fundamentos;

public class Logicos {
public static void main(String[] args) {
	boolean condicao1 = true;
	boolean condicao2 = 3 > 7 ;
	
	System.out.println(condicao1 && condicao2);
	System.out.println(condicao1 ||condicao2);
	System.out.println(condicao1 ^ condicao2);
	System.out.println(!!condicao1);
	System.out.println(!condicao2);
	
	//tabela verdade E (and)
	System.out.println("tabela verdade E (and)");
	System.out.println(true && true);
	System.out.println(true && false);
	//System.out.println(false && true);
	//System.out.println(false && false);
	
	//TABELA VERDADE OU 
	System.out.println("tabela verdade OU (OR)");
	//System.out.println(true || true);
	//System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("tabela verdade OU EXCLUSIVO (XOR)");
	System.out.println(true ^true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println("tabela verdade NOT");
	System.out.println(!true);
	System.out.println(!false);
	
	
	
	
	
	
}
}
