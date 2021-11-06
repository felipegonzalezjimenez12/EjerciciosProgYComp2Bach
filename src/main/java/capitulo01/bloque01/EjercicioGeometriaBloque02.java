package capitulo01.bloque01;

import java.util.Scanner;

public class EjercicioGeometriaBloque02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float cate1,cate2;
		
		float radio;
		
		float base,altura;
		
		int opcion;
		
		System.out.println("Menú:");
		System.out.println("1. Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2. Cálculo de la superficie de una circunferencia.");
		System.out.println("3. Cálculo del perímetro de una circunferencia.");
		System.out.println("4. Cálculo del área de un rectángulo.");
		System.out.println("5. Cálculo del área de un triángulo.");
		System.out.println("0. Salir de la aplicación.");
		
		
		System.out.println("Introduzca la opciónn: ");
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
			System.out.println("El perímetro vale: " + (2*3.14*radio));	
			break;
			
			 case 4:
				 System.out.println("Introduzca la base del rectángulo:");
				 base = sc.nextFloat();
				 System.out.println("Introduzca la altura del rectángulo:");
	             altura = sc.nextFloat();
	             System.out.println("El área del rectángulo es :"  +  (base * altura));
	             break;
	             
			 case 5:
				 System.out.println("Introduzca la base del triángulo:");
				 base = sc.nextFloat();
				 System.out.println("Introduzca la altura del triángulo:");
	             altura = sc.nextFloat();
	             System.out.println("El área del triángulo es :"  +  ((base * altura)/2));
	             break;  
	             
			 case 0:
				System.out.println("Acaba de salir de la aplicación");
	             break;  
			 default:
					System.out.println("Opción incorrrecta");
		}
	}
		
		
	}


