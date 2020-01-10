package ejercicio6;

//Esta clase es hija de Mamiferos con "extends" añado con "implements" las interfaces
public class Murcielago extends Mamiferos implements PuedeCaminar, PuedeNadar{
	int patas = 2;
	boolean salvaje = true;
	
	public void caminar() {
		System.out.println("El murcielago no camina, sólo el murcielago vampiro es capaz de correr con sus 4 patas.");
	}
	public void nadar() {
		System.out.println("El murcielago si que sabe nadar.");
	}

}
