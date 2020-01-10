package Interfaces;

class Humano extends Mamifero{
	
	public Humano(String nombre) {
		super(nombre);
		
	}

	public void pensar() {
		
		System.out.println("Soy capaz de pensar");
	}
}