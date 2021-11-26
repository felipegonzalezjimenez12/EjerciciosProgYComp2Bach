package Capitulo05array;

public class Ejercicio01MediaArray {

	public static void main(String[] args) {
		int array[] = new int[]];
		int suma  = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		System.out.println("Suma: " + suma);
	}

}
