package Bloque03;

import java.util.Scanner;

public class Ejercicio2Bloque02 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    	int repeticiones;
    	int num ;
    	int menor = 0,mayor = 0;
	   System.out.println("cuantos numeros quiere pedir:");
	   repeticiones = sc.nextInt();
	   for ( int i = 0 ; i<repeticiones ; i++) {
		  System.out.println("numero:");
		  num = sc.nextInt();
		  if(i == 0) {
			  mayor = num;
			  menor = num;	  
		  }
		  else {
		  if (num > mayor) {
			  
			  mayor = num;	  
		  } 
             if (num <menor) {  
			  menor = num;		  
		  }
		  }  
	    }
  
	 System.out.println("mayor:" + mayor   +    "menor:" + menor);
	  }
	}


