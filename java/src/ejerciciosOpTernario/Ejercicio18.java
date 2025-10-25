package ejerciciosOpTernario;

import java.util.Scanner;

/*
 *  Diseña un programa que lea de teclado 
 *  dos variables booleanas para representar 
 *  si un estudiante aprobó dos asignaturas diferentes. 
 *  Luego, muestra en pantalla un mensaje que
    indique si el estudiante aprueba el curso o repite
 */

public class Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Se ha aprobado la asignatura 1?: ");
		boolean asignatura1Aprobada = scan.nextBoolean();
		
		System.out.print("Se ha aprobado la asignatura 2?: ");
		boolean asignatura2Aprobada = scan.nextBoolean();
		
		scan.close();
		
		String apruebaORepite = asignatura1Aprobada && asignatura2Aprobada ? "aprueba el curso" : "repite el curso";
		System.out.printf("El alumno %s", apruebaORepite);
	}
}
