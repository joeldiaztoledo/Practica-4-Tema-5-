//Autor: Joel Díaz Toledo
import java.util.Scanner;
public class Practica4_T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Juego: Adivinar el número.");
		int numero = 0;
		int contador = 0;
		int solucion = (int) Math.floor(Math.random()*(100)+1);
		
		while (numero != solucion) {
		
			System.out.print("Introduzca un número: ");
			numero = sc.nextInt();
			
			if ( numero > solucion) {
				System.out.println("Menor.");
			}
			
			if (numero < solucion) {
				System.out.println("Mayor.");
			}
		contador++;
		}
		
		System.out.print("!Has acertado!     Intentos realizados: " + contador + ".");
		sc.close();
	}
}
