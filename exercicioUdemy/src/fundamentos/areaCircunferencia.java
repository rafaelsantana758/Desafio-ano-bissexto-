package fundamentos;

public class areaCircunferencia {
public static void main(String[] args) {
	 double raio =3.4;
	 double PI = 3.14159;
	 
	 double area =  PI * raio * raio;
	 System.out.println(area );
	 raio = 10; // aqui não preciso colocar double pq ja foi identificado no começo 
	 area = PI * raio * raio;
	 System.out.println("Area " + area +"M2.");
}
}
