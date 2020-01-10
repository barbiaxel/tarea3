package ejercicio6;

//Creo la superclase Mamiferos con "implements" seguido del nombre de la interfaz
public class Mamiferos implements PuedeCaminar{
	
	//Atributos
	String especie;
	String color;
	
	//Metodo
	public void caminar() {
		System.out.println("Los mamíferos son animales que pueden moverse.");
	}
}
