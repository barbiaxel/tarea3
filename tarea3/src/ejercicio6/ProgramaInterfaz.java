package ejercicio6;

public class ProgramaInterfaz {

	public static void main(String[] args) {
		Mamiferos m = new Mamiferos();
		camina(m);
		
		Gato g = new Gato();
		camina(g);
		nada(g);
		
		Tigre t = new Tigre();
		camina(t);
		nada(t);
		
		Murcielago mu = new Murcielago();
		camina(mu);
		nada(mu);
		
		Loro l = new Loro();
		camina(l);
		vuela(l);
		
		Avestruz a = new Avestruz();
		camina(a);
			
	}
	
	public static void nada(PuedeNadar nadador) {
		nadador.nadar();
	}
	
	public static void vuela(PuedeVolar volador) {
		volador.volar();
	}
	
	public static void camina(PuedeCaminar caminante) {
		caminante.caminar();
	}

}
