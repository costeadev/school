package ejerciciosIf;

/*
 * Realizar un programa que dado un número entero indique si es o no par. 
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
		scan.close();
		
		boolean isEven = (num % 2 == 0);
		
		if (isEven) {
			System.out.printf("%n%d es par", num);
		} else {
			System.out.printf("%n%d es impar", num);
		}
		
		// Una forma bastante más compacta de hacerlo
		//System.out.printf("%d es %s", num, (num % 2 == 0) ? "par" : "impar" );
	}
}
