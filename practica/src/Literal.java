/**
 Literal.java
 Programa para prueba de literales
 */

public class Literal {

	public static void main(String arg[]){
		double dato1 = -11.1;
		Integer dato2 = 037745567;
		float dato3 = 1.26f;
		double dato4 = -88.28;
		double dato5 = .3e27;
		
		
		
		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);

		//Cambios de Base 10, Binario y Octal
		
		System.out.println("Base 10:" + dato2);
		System.out.println("Binario:"+ Integer.toBinaryString(dato2));
		System.out.println("Octal:" + Integer.toOctalString(dato2));
		
	
	}
	

	


}
