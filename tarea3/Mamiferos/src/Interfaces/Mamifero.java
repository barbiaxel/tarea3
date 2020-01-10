package Interfaces;

class Mamifero{
	
	private String nombreSerVivo;
	
	public Mamifero(String nombre) {
		
		nombreSerVivo=nombre;
	}
	protected void respirar() {
		
		System.out.println("Soy capaz de respirar");
	}
	
	public void CuidarCrias() {
		
		System.out.println("Cuido de mis crias hasta que se valgan por si mismas");
	}
	
	public void getNombre() {
		
		System.out.println("El nombre del ser vivo es: "+ nombreSerVivo);
	}
	
	public void pensar() {
		
		System.out.println("Pensamiento basico instintivo");
	}
}