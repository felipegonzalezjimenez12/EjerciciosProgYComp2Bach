package capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicioscondicionales02 {

	public static void main(String[] args) {
	
		float n1;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero:");
		n1 = sc.nextInt();
		
		
		
		if (n1 % 2 == 0) {
			System.out.println("El numero que has introducido es par" );
		}
		
		
		if (n1 % 2 == 1) {
			System.out.println("El numero que has introducido es impar" );
		}
			}

}
