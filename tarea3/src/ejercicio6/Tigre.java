package ejercicio6;

//Esta clase es hija de Felinos con "extends" añado con "implements" las interfaces
public class Tigre extends Felinos implements PuedeCaminar, PuedeNadar {
	int patas = 4;
	boolean salvaje = true;
	
	public void caminar() {
		System.out.println("El tigre puede caminar.");
	}
	public void nadar() {
		System.out.println("El tigre puede nadar, de hecho es un excelente nadador.");
	}

}
