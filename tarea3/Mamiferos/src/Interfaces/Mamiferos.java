package Interfaces;

import java.util.Scanner;

class Mamiferos {
	
	public static void main(String[] args) {
		
		//creo 3 objetos de las calses caballo, humano y gorila
		Scanner teclado=new Scanner(System.in);
		
		Caballo Babieca = new Caballo("CaBallo");
		Humano Juan = new Humano("Juan");
		Gorila Copito = new Gorila("Copito");
		
		Babieca.pensar();
		System.out.println("Babieca tiene "+Babieca.numPatas() +" patas");
		Babieca.CuidarCrias();
		Juan.pensar();
		Juan.respirar();
				
		System.out.println("Babieca tiene "+Babieca.numPatas()+ " patas");
		System.out.println("Babieca salta con "+Babieca.SaltonumPatas()+ " patas");
	}
	
}
	
	
	
	
	
	
	

