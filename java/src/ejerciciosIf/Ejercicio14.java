package ejerciciosIf;

import java.util.Scanner;

/*
 * Recibir un número e indicar si es válido. Es válido si es un numero positivo menor que 100 o un numero negativo menor que -100.
 * Validos: 22, 44, 63, 77, 99,-111,-2323,-2424
 * No válidos: -22,-45-73, 234. 51515.222
 */

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean isValid = (num > 0 && num < 100) || (num < -100);
		
		if (!isValid) {
			System.err.println("El número introducido no es válido");
			return;
		} else {
			System.out.printf("%d es un número válido", num);
		}
	}
}
