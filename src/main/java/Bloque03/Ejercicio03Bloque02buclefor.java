package Bloque03;

import java.util.Scanner;

public class Ejercicio03Bloque02buclefor {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca numero:");
		num = sc.nextInt();
		
		for (int i = 0; (num * i) < 100; i++ ) {
			System.out.println("multiplo de " + num + ":"  + (num *i));
			
			
			
		}
		
	}

}
