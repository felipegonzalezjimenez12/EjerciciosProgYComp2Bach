package Capitulo05array;

public class Ejercicio02InversoArray {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = array.length-1  ; i < 0 ; i--) {
			System.out.println(array[i] + " ");
		}
		
	}

}
