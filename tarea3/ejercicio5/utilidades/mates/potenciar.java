package utilidades.mates;

public class potenciar {
	
	public void potencia(int x, int z) {
        int resultado = 1;
        for (int i = 1; i <= z; i++) {
           resultado = resultado * x;
        }
        System.out.println("El resultado de la potencia es: "+resultado);
    }
}