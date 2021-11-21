package Bloque03for;

import java.util.Scanner;

public class Ejercicio03opcionalBloque03for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1; 
				
				
		for(int i =0; num != 0 ;i++) {
					
			System.out.println("introduzca un numero:");
			num  = sc.nextInt();
			
			if (num !=0) {
					  		
		for (int a = 1; (num * a) < num*11; a++ ) {
			System.out.println("multiplicacion de " + num + ":"  + (num *a));
				
					
					
				}
			}
	}

}
}
