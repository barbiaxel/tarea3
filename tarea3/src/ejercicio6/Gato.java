package ejercicio6;

//Esta clase es hija de Felinos con "extends" añado con "implements" las interfaces
public class Gato extends Felinos implements PuedeCaminar, PuedeNadar{
	int patas = 4;
	boolean salvaje = false;
	
	public void caminar() {
		System.out.println("El gato puede caminar.");
	}
	public void nadar() {
		System.out.println("Los gatos no son amigos de agua, pero pueden nadar.");
	}
	
}
