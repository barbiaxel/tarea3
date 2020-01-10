package Interfaces;

class Caballo extends Mamifero implements IMamiferosTerrestres, ISaltoConPatas, IDeportes{
	
	public Caballo(String nombre) {
		super(nombre);
		
	}

	public void galopar() {
		
		System.out.println("Soy capaz de galopar");
		respirar();
	}

	public int numPatas() {
		
		return 4;
	}

	public int SaltonumPatas() {
		
		return 2;
	}

	public String deporte() {
		
		return "Hipica";
	}

	public boolean esOlimpico() {
		
		return true;
	}
}
