package capitulo01.bloque01;

import java.util.Scanner;

public class EjercicioGeometriaBloque02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float cate1,cate2;
		
		float radio;
		
		float base,altura;
		
		int opcion;
		
		System.out.println("Men�:");
		System.out.println("1. C�lculo de la hipotenusa de un tri�ngulo.");
		System.out.println("2. C�lculo de la superficie de una circunferencia.");
		System.out.println("3. C�lculo del per�metro de una circunferencia.");
		System.out.println("4. C�lculo del �rea de un rect�ngulo.");
		System.out.println("5. C�lculo del �rea de un tri�ngulo.");
		System.out.println("0. Salir de la aplicaci�n.");
		
		
		System.out.println("Introduzca la opci�nn: ");
		opcion = sc.nextInt();
		  
		
		switch(opcion) {
		case 1:
			System.out.println("Cateto 1: ");
			cate1 = sc.nextFloat();
			System.out.println("Cateto 2: ");
			cate2 = sc.nextFloat();
			 System.out.println("La hipotenusa vale:" +( (cate1 * cate1) + (cate2 * cate2)));	
			break;
				
			
			case 2:
			System.out.println("Introduzca el radio de la circunferencia:");
			radio = sc.nextFloat();
			System.out.println("La superficie vale: " + ((radio * radio) * 3.14));
			 break;
			
			 
			 case 3:
			System.out.println("Introduzca el radio de la circunferencia:"); 
			radio = sc.nextFloat(); 
			System.out.println("El per�metro vale: " + (2*3.14*radio));	
			break;
			
			 case 4:
				 System.out.println("Introduzca la base del rect�ngulo:");
				 base = sc.nextFloat();
				 System.out.println("Introduzca la altura del rect�ngulo:");
	             altura = sc.nextFloat();
	             System.out.println("El �rea del rect�ngulo es :"  +  (base * altura));
	             break;
	             
			 case 5:
				 System.out.println("Introduzca la base del tri�ngulo:");
				 base = sc.nextFloat();
				 System.out.println("Introduzca la altura del tri�ngulo:");
	             altura = sc.nextFloat();
	             System.out.println("El �rea del tri�ngulo es :"  +  ((base * altura)/2));
	             break;  
	             
			 case 0:
				System.out.println("Acaba de salir de la aplicaci�n");
	             break;  
			 default:
					System.out.println("Opci�n incorrrecta");
		}
	}
		
		
	}


