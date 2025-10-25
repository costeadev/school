package ejerciciosIf;

import java.util.Scanner;

// Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.

public class Ejercicio22_2 {
	
  public static double calculateDigits(int num) {
	  if (num == 0) return 1;
	  return Math.log10(num) + 1;
  }
  
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Introduce un número entre 0 y 99999: ");
	int num = scan.nextInt();
	
	scan.close();
	
	// Input validation
	if (num < 0 || num > 99999) {
		System.err.print("Error: Número fuera de rango."); 
		return;
	}
	
	
	int digitos = (int) calculateDigits(num);
	
	System.out.printf("El número %d tiene %d digito%s", num, digitos, digitos > 1 ? "s" : "");
  }
}
