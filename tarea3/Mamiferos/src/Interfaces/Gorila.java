package Interfaces;

class Gorila extends Mamifero implements IMamiferosTerrestres, ISaltoConPatas{
	
	public Gorila(String nombre) {
		super(nombre);
		
	}

	public void trepar() {
		
		System.out.println("Soy capaz de trepar");
	}
	
	public void pensar() {
		
		System.out.println("pensamiento basico avanzado");
	}

	public int numPatas() {
		
		return 2;
	}

	public int SaltonumPatas() {
		
		return 2;
	}
}