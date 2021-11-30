package Capitulo05array;

public class Ejercicio01MediaArray {

	public static void main(String[] args) {
		int array[] = new int[150];
		int suma  = 0;
		int mayor=0,menor=0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
			
			if (i ==0) {
				mayor = array[i];
				menor = array[i];

			}
			
			else {
				
				if (array[i]<menor) {
					menor = array[i];	
				}

				if (array[i]>mayor) {
					mayor = array[i];	
				}
		
			}
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + suma/5);
        System.out.println("mayor:" + mayor + "Menor:" + menor);
	} 

}
