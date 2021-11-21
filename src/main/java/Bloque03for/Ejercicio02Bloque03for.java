package Bloque03for;

import java.util.Scanner;

public class Ejercicio02Bloque03for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor=0,menor=0,num=1;
		
		
        
		for(int i =0; num != 0 ;i++) {
			
			System.out.println("introduzca un numero:");
			num  = sc.nextInt();
			  
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
 }}
