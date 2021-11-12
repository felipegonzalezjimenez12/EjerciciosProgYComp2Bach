package Bloque03;

import java.util.Scanner;

public class Ejercicio03Bloque03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int repeticiones,num,contadorp = 0, contadorn = 0;
        
        System.out.println("cuantos numeros desea introducir?");
        repeticiones = sc.nextInt();
        
        for (int i = 0; i < repeticiones  ; i++) {
        	System.out.println("introduzca un numero");
        	num = sc.nextInt();
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
