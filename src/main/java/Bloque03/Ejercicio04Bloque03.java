package Bloque03;

import java.util.Scanner;

public class Ejercicio04Bloque03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeticiones = 0,num;
		int suma = 0;
		float media;
	  System.out.println("cuantos numeros quiere pedir:");
	  repeticiones = sc.nextInt();
	  
	  for ( int i = 0 ; i<repeticiones ; i++) {
		  System.out.println("numero:");
		  num = sc.nextInt();
		  
		  if(num > 0) {
		    	suma = suma + num;
		    	
		    } 
	
	  }
	  media = suma / (float)repeticiones;
	  System.out.println("la media es " + media);

	}

}
