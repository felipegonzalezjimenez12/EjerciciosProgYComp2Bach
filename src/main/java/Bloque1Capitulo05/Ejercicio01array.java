package Bloque1Capitulo05;

public class Ejercicio01array {

	public static void main(String[] args) {
		int array[] = new int[150];
		int suma  = 0, mayor=0, menor=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
			 if(i == 0) {
				  mayor = array[i];
				  menor = array[i];	  
			  }
			  else {
			  if (array[i] > mayor) {
				  
				  mayor = array[i];	  
			  } 
	             if (array[i] <menor) {  
				  menor =array[i];		  
			  }
		}
		
		for (int e = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Media:" + suma/150);
		 System.out.println("mayor:" + mayor   +    "menor:" + menor);

		}}}
	


