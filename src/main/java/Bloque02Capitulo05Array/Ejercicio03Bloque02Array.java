package Bloque02Capitulo05Array;

import java.util.Scanner;

public class Ejercicio03Bloque02Array {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
	int array[] = new int[150];
	int num;
	
	System.out.println("introduzca el numero:");
	num = sc.nextInt();

	for (int i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random() * (100));
	}
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]  + " ");
		
	}
	System.out.println();


	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] * num  + " ");
		
	}		System.out.println();


   
	}

}
