package capitulo01.bloque01;

import java.util.Scanner;

public class intercambiodevariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int aux;
		
	 System.out.println("introduzca la primera variable :");
	 n1 = sc.nextInt();
	 
	 System.out.println("introduzca la segunda variable :");
	 n2 = sc.nextInt();
	 
	 System.out.println("n1 = " + n1);
	 System.out.println("n2 = " + n2);
	 aux = n1;
	 
	 n1 = n2;
	 
	 n2 = aux;
	 System.out.println("n1 = " + n1);
	 System.out.println("n2 = " + n2);
	 
	}

}
