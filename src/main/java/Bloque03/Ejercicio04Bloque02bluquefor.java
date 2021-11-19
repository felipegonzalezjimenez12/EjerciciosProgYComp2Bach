package Bloque03;

import java.util.Scanner;

public class Ejercicio04Bloque02bluquefor {

	public static void main(String[] args) {
		int num,limite;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca numero:");
		num = sc.nextInt();
		
		System.out.println("introduzca limite:");
		limite = sc.nextInt();
		
		for (int i = 0; (num * i) < limite; i++ ) {
			System.out.println("multiplo de " + num + ":"  + (num *i));
			
			
			
		}
		
	}

	}


