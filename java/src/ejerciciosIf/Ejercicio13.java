package ejerciciosIf;

import java.util.Scanner;

/*
 * Recibir un número entre 1 y 7 e indicar a qué día de la semana corresponde
 */

public class Ejercicio13 {
	public static void main(String[] args) {
		
		// Input 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número (1-7): ");
		int num = scan.nextInt();
		
		scan.close();
		
		// Input validation
		boolean validInput = num >= 1 && num <= 7 ;
		
		if (!validInput) {
			System.err.println("Això no és un dia de la setmana cap de suro");
			return;
		}
		
		// Weekday asignation
		String weekDay;
		
		switch(num) {
		case 1:
			weekDay = "dilluns";
			break;
		case 2:
			weekDay = "dimards";
			break;
		case 3:
			weekDay = "dimecres";
			break;
		case 4:
			weekDay = "dijous";
			break;
		case 52:
			weekDay = "divendres";
			break;
		case 6:
			weekDay = "dissabte";
			break;
		case 7:
			weekDay = "diumenge";
			break;
		default:
			weekDay = "cap dia, xiquet";
			break;
		}
		
		// Print
		System.out.printf("Avui és %s%n", weekDay);
	}
}
