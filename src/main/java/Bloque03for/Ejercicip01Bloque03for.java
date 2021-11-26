package Bloque03for;

import java.util.Scanner;

public class Ejercicip01Bloque03for {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int repeticiones,num = 1,suma=0;
		float media;
		
		
		for(int i =0; num != 0 ;i++) {
			
			System.out.println("introduzca un numero:");
			num  = sc.nextInt();
			
			suma+= num;
			
			if(num!=0) {
			media = suma/ (float)(i + 1);
			}
		}
		
		System.out.println(" la media es : " + media );
		
		System.out.println(" la suma es : " + suma );

		
		
		
		
		
		
	}

}
