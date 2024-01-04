package fundamentos;

public class temperatura {
public static void main(String[] args) {
	// ( F - 32) * 5/9 = C
	
	double f = 86;
	double subtra = 32;
	double divisor = 5.0/9.0;
	double cels = (f - subtra) * divisor;
	
	System.out.println(cels);
	
	double ff = 86 - 32;
	double ss = 5/9.0;
    double cc = ff * ss;
    System.out.println(cc);
	
}
}
