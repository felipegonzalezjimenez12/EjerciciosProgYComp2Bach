package capitulo01.bloque01;

import java.util.Scanner;

public class Ejerciciocondicionales01 {

	public static void main(String[] args) {
		float n1;
		float n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero:");
		n1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("El número menor es :" + n2);
		}
		else {
			System.out.println("El número menor es:" + n1);
		}

	}

}
