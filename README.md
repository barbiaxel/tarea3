# tarea3
1. Ejercicio: Realiza una clase numero, que almacene un número entero y tenga las siguientes
características:
Constructor por defecto que inicializa a 0 el número interno.
Constructor que inicializa el número interno.
Método anyade(int valor) que permite sumarle un valor al número interno.
Método resta(int valor) que resta un valor al número interno.
Método getValor que devuelve el valor interno.
Método esPrimo que devuelve True si el número interno es primo.
Método setNumero que inicializa de nuevo el valor interno.
Haz que la clase tenga un método main y comprueba los distintos métodos.

2. Ejercicio: Modificación del ejercicio resuelto número 5. Modifica la clase satelite y añade los
siguientes métodos:

Método void variaAltura(double desplazamiento). Este método acepta un parámetro
que será positivo o negativo dependiendo de si el satélite tiene que acercarse o
alejarse a la Tierra.

Método bolean enOrbita( ). Este método devolverá false si el satélite está en tierra y
trae en caso contrario.

Método void variaPosicion(double variap, double variam). Este método permite
modificar los atributos de posición (meridiano y paralelo) mediante los parámetros
variap y variam. Estos parámetros serán valores positivos o negativos relativos que
harán al satélite modificar su posición.

3.Ejercicio: Realiza un programa que muestre por pantalla el siguiente cuadrado:
1 1 1 1 1
1 2 3 4 5
1 3 6 10 15
1 4 10 20 35
1 5 15 35 70
El programa podrá generar un cuadrado de cualquier dimensión. Utiliza la recursividad.

4.Ejercicio: Realiza de forma iterativa el siguiente ejercicio de obtener la serie de Fibonacci que
es recursivo.
Se trata de la serie de Fibonacci, cuya característica es la siguiente:
Fibonacci(0) = 0
Fibonacci(1) = 1
Y para el resto de números Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
class Test {
public static int fibonacci (int num) {
if (num == 0) return 0;
if (num == 1) return 1;
return
fibonacci(num-1) + fibonacci(num-2);
}
public static void main (String[] args) {
Scanner teclado=new Scanner(System.in);
int numero ;
System.out.println ("Introduce cuántos términos de la serie deseas: ");
numero = teclado.nextInt();
for (int i = 0; i < numero; i++)
System.out.print (fibonacci(i) + "
");
}

5.Ejercicio: Crea un paquete Utilidades.mates con dos clases: sumar y potenciar. La clase
sumar tendrá un método int suma(int, int) que devolverá la suma de los dos parámetros
introducidos y la clase potenciar tendrá un método potencia(int, int) que devolverá el resultado
de elevar el primer parámetro al segundo parámetro. Realiza un programa que haga uso de
este paquete.

6.Ejercicio: Algunos seres pueden caminar y pueden nadar estas dos capacidades son
interfaces (PuedeCaminar.java y PuedeNadar.java). Otros animales también pueden volar
(interface PuedeVolar.java)
Crear un programa similar al de los ejercicios resueltos que cree varios seres (gato, loro,
avestruz murciélago y tigre) y muestre qué es lo que puede hacer cada uno mediante la
implementación de las tres interfaces anteriores y la creación de las super clases
correspondientes (Mamífero, Aves y Felinos). Los métodos nadar(), caminar() y volar()
simplemente mostrarán un mensaje en cada clase de animal que diga el animar que es y que
puede hacer. 

P.E:
Los mamíferos son animales que pueden moverse (Mamifero.java). El gato es un mamífero
que puede nadar y caminar (Gato.java)
Las aves son animales que pueden caminar (Aves.java). Un Loro es un ave que puede
caminar y volar pero no puede nadar. El Avestruz es un ave que solo camina.
Crea la clase Avestruz.java (ave que solo camina) hija de Aves.java.
Crea la clase Loro.java (ave que camina y vuela) hija de Aves.java.
Crea la clase Murciélago.java (mamífero que vuela y camina) hija de Mamifero.java
Cree la clase Felino.java (mamífero que camina y puede nadar) hija de Mamifero.java.
Cree la clase Gato.java (es un Felino)
Cree la clase Tigre.java (es un Felino).
