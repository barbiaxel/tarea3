package ejercicio6;

//Esta clase es hija de Aves con "extends" a�ado con "implements" las interfaces
public class Avestruz extends Aves implements PuedeCaminar{
	boolean salvaje = true;
	
	public void caminar() {
		System.out.println("El avestruz puede caminar.");
	}
}
