package Bloque03;

import java.util.Scanner;

public class Ejercicio02Bloque03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int suma = 0 , num, repeticiones;
        
        System.out.println("introduzca cuantos numeros desea incorporar a la suma:");
		repeticiones = sc.nextInt();
		
		
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("numero:");
			num = sc.nextInt();
		    if(num > 10) {
		    	suma = suma + num;
		    	
		    }
		
			
		}
		
		System.out.println("la suma de los mayores de 10 es :" + suma);
	}

}
