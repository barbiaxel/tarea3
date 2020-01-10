package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
	
	private static Scanner teclado;

	public static int fibonacci (int num) {
		if (num == 0 || num == 1) return num;
		
		int f0 = 0;
		int f1 = 1;
		int fnum = 0;
		
		for (int i = 2; i <= num; i++) {
			fnum = f0 + f1;
			f0 = f1;
			f1 = fnum;
		}
		return fnum;
	}
	
	public static void main (String[] args) {
		teclado = new Scanner(System.in);
		int numero ;
		System.out.println ("Introduce cuántos términos de la serie deseas: ");
		numero = teclado.nextInt();
		
		for (int i = 0; i < numero; i++)
		System.out.print (fibonacci(i) + "");
		}

}
