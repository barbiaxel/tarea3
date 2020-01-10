package ejercicio2;

public class satelite {
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	satelite ( double m, double p, double d ) {
	meridiano = m;
	paralelo = p;
	distancia_tierra = d;
	}
	
	satelite(){
	meridiano = paralelo = distancia_tierra = 0;
	}
	
	public void setPosicion(double m, double p, double d ) {
	meridiano = m;
	paralelo = p;
	distancia_tierra = d;
	}
	
	public void variaAltura(double desplazamiento) {
	if (desplazamiento > 0) {
			 distancia_tierra += desplazamiento;
		}
		if (desplazamiento < 0) {
			
			 if (distancia_tierra == 0) {
				 System.out.println("No es posible.");
			 } else {
				distancia_tierra -= desplazamiento;
			 }
		}
	}
	
	public boolean enOrbita() {
		boolean orbita;
		 if (distancia_tierra==0){
			 orbita=false;
		 }
		 else{
			 orbita=true;
		 }
		 return (orbita);
	}
	
	public void variaPosicion(double variap, double variam) {
		paralelo = variap;
		meridiano = variam;
	}
}