package Bloque02Capitulo05Array;

public class Ejercicio02Bloque02Array {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100));
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
	
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100));
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 ==0) {
				System.out.println(array[i]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();

		}
	
	
}

