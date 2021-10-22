package capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio02calculocuotamensual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float interesanual,interesmensual;
		int Meses;
		float capital;
		float euribor, diferencial, auxiliar, cuotaMensual;
		 
		
		System.out.println("introduzca el capoital :");
		capital = sc.nextFloat();
		System.out.println("el capital es : + capital");
		
		System.out.println("introduzca meses :");
		Meses = sc.nextInt();
		System.out.println("el capital es :" + Meses);
		
		System.out.println("introduzca diferencial :");
		diferencial = sc.nextFloat();
		System.out.println("el diferencial es :"  + diferencial);
		
		
	    System.out.println("introduzca euribor :");
	    euribor = sc.nextFloat();
	    System.out.println("el euribor es :" + euribor);
	    
	    
		
		//calculos
		
		interesanual = euribor + diferencial;
		interesmensual = interesanual / 12 / 100;
		auxiliar =  (float)Math.pow(1+interesmensual, Meses );
		cuotaMensual = capital * (interesmensual * auxiliar) /(auxiliar - 1);
		
		System.out.println("debes pagar" + cuotaMensual+ "euro cada mes");

	}

}
