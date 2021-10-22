package capitulo01.bloque01;

import java.util.Scanner;

public class Sumadenumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		float suma;
		
		System.out.println("introduzca el primer numero enteros para la suma:");
		n1 = sc.nextInt();
		
		System.out.println("introduzca el segundo numero enteros para la suma:");
		n2 = sc.nextInt();
		
		System.out.println("introduzca el tercer numero enteros para la suma:");
		n3 = sc.nextInt();
		
		
		suma = n1 + n2 + n3;
		
		System.out.println("la suma de los tres numeros enteros es :"+ suma);
		
		
		float media = (suma / 3);
		
		System.out.println("la media de los tres numeros es " + media);

	}      

}
