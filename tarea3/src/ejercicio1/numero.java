package ejercicio1;
import java.util.Scanner;

public class numero {

	//atributos o propiedades
	private Scanner teclado;
	int num;
		
	//métodos de la clase
	public numero() {num = 0;} //constructor de la clase numero que inicializa a 0
	public numero(int n) {num = n;} //constructor de numero
		
		public void pedir() {
			teclado = new Scanner(System.in);
			System.out.println("Introduce un número.");
			num = teclado.nextInt();
		}

		public int anyade(int suma) {
			num +=suma;
			return num;
		}
		
		public int resta (int resta) {
			num -=resta;
			return num;
		}
		//Devuelve el varlor interno
		public int getValor() {
			return num;
		}
			
		public boolean esPrimo(int numero) {
		        if (num<2) return false;
		        for (int i=2;i<=num/i;i++){
		            if ((num%i)==0)
		                return false;
		        }
		        return true;
		}
		//Inicializa de nuevo el valor interno
		public int setNumero() {
			return num;
		}	

		public static void main(String[] args) {
			numero num = new numero(10);
			num.anyade(2);
			num.resta(2);
			num.getValor();
			num.esPrimo(6);
			num.setNumero();
			
			System.out.println("Añadido: " +num.anyade(2));
			System.out.println("Resta: " +num.resta(2));
			System.out.println("Valor interno: " +num.getValor());
			System.out.println("Es primo: " +num.esPrimo(6));
			System.out.println("Inicializa el valor interno: " +num.setNumero());

		}

}
