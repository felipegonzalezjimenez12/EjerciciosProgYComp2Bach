package capitulo01.bloque01;

import java.util.Scanner;

public class Ejemplo01introducciondatos {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("introduzca un numero: ");
	int num = sc.nextInt();
	
	System.out.println("el numero introducidoes:  " +num);
	
	System.out.println("introduzca un numero flotante :" );
	float numm = sc.nextFloat();
	
	System.out.println("el numero flotante es : " +numm);
	
	System.out.println("introduzca un string");
	String str = sc.next();
	System.out.println("el string introducido es :" + str);
		
	}

}  
