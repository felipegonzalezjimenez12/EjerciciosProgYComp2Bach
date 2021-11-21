package Bloque03for;

import java.util.Scanner;

public class Ejercicio04Bloque03for {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      int num = 1;
	  int contadorp=0,contadorn=0;
	for(int i =0; num != 0 ;i++) {
			
			System.out.println("introduzca un numero:");
			num  = sc.nextInt();
			
            if (num >0) {
        		
        		contadorp++;
        	}
         	if (num < 0) {
        		contadorn++;
        	}
        	
	}
	
	System.out.println("positivos:" + contadorp  +   "negativos:" + contadorn);

	}

}
