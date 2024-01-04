package fundamentos;

public class atribuicao {
public static void main(String[] args) {
	int a = 3;
	int b = a;
	int c =  a +b;
	
	c += b; // é mesma coisa que c =c + b
	c -= a; // c = c - a
	c *= b ; // c = c * b
	c /= a ; // c = c / a 
	
	System.out.println(c);
	
int s = 1;
s--;
System.out.println(s);
}
}
