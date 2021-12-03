package Bloque02Capitulo05Array;

import java.util.Iterator;

public class Ejercicio04Bloque02Array {       

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6};
		int aux;
		
		System.out.println("Array:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+  " ");
			
		}
		System.out.println();
		aux = array[array.length -1];
		for (int i = array.length - 2; i >= 0; i--) {
			
			array[i + 1] = array [i];
			
			
		}	
		
		array[0] = aux;
		
		System.out.println("Array:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+  " ");
			
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
