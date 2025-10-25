package ejerciciosOpTernario;

import java.util.Scanner;

/*
 * Escribe un programa que lea por teclado 
 * dos variables de tipo double para representar 
 * las notas de un estudiante en dos evaluaciones. 
 * Muestra en pantalla el mensaje 
 * “Muy bien” si el alumno ha aprobado las dos asignaturas 
 * y la suma de las dos notas es al menos 14.
 */

public class Ejercicio25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce nota primera evaluación: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Introduce nota segunda evaluación: ");
		double nota2 = scan.nextDouble();
		
		scan.close();
		
		double sumaNotas = nota1 + nota2;
		
		boolean notasValidas = (nota1 >= 0 && nota1 <= 10) &&
							   (nota2 >= 0 && nota2 <= 10);
		
		String mensaje = !notasValidas ? "Notas no válidas"
						 : (nota1 >= 5 && nota2 >= 5 && sumaNotas >= 14)
								 ? "Muy bien"
								 : "Muy mal";
		System.out.println(mensaje);
	}
}
