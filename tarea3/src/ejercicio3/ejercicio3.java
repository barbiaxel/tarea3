package ejercicio3;

import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
	
	private static Scanner teclado;

	public static int elemento (int fila, int columna) {
		if (fila <1 ||columna < 1) return 1;
		
		if (columna == 1 || fila ==1) return 1;
		return elemento (fila-1, columna) + elemento (fila, columna -1);
		}
	
	public static void main (String[] args) throws IOException{
		int numfilas ;
		teclado = new Scanner(System.in);
		
		System.out.println ("Introduce la altura del cuadrado: ");
		numfilas = teclado.nextInt();
		
		for( int i=1; i<( numfilas +1); i++) {
			
			for( int j=1; j<(numfilas +1); j++) {
				int dato = elemento(i, j);
					if (dato > 0)
						System.out.print (dato+ "\t" );
				}
				System.out.println ("");
		}
		}
	}


