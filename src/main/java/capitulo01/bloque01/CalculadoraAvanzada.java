package capitulo01.bloque01;

import java.util.Scanner;

public class CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int opcion, numero1, numero2;
		
		
		System.out.println("Men�:");
		System.out.println("1.- Potencia");
		System.out.println("2.- Raiz");
		System.out.println("3.- Modulo de division");
		
		System.out.println("Introduzca la opci�nn: ");
		opcion = sc.nextInt();
		
		System.out.println("Introduzca el primer n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero: ");
		numero2 = sc.nextInt();
		
		
		//CALCULOS
		switch(opcion) {
		case 1:
			System.out.println("La potencia vale: " + Math.pow(numero1, numero2));
			break;
		case 2:
			System.out.println("La raiz vale: " + Math.pow(numero1,1f/numero2));
			break;
		case 3:
			System.out.println("El M�dulo de la divisi�n vale: " + (numero1 * numero2));
			break;
		
		}
	}

}
