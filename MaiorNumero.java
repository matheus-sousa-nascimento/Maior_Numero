/*
 * MaiorNumero.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MaiorNumero {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int val1 = 0;
		int val2 = 0;
		
		System.out.print("Digite um valor: ");
		val1 = entrada.nextInt();
		
		System.out.print("Digite outro valor: ");
		val2 = entrada.nextInt();
		
		int res = ( val1 > val2 ? val1 : val2);
		
		System.out.println(res);
	}
}

