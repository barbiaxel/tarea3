package ejercicio6;

//Esta clase es hija de Mamiferos con "extends" a�ado con "implements" las interfaces
public class Loro extends Aves implements PuedeCaminar, PuedeVolar {
	boolean salvaje = true;
	boolean domestico = true;
	
	public void caminar() {
		System.out.println("El loro si que sabe andar.");
	}
	public void volar() {
		System.out.println("El loro tambi�n puede volar, a excepci�n de la especia Kakapo de Nueva Zelanda.");
	}

}


