package capitulo04OrientacionaObjetosEjemplo05Mueble;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		
		
		do {
			opcionElegida = menu();
			
			switch (opcionElegida) {
			case 1: // Se va a introducir un artículo comestible
				Silla silla = new Silla();
				
				System.out.println("Introduzca el color del mueble: ");
			    silla.setColor(sc.toString());
				
				System.out.println("Introduzca el tipo de madre del mueble: ");
				silla.setTipoMadera(sc.toString());
				
				System.out.println("Introduzca el numero de patas de la silla : ");
				silla.setNumPatas(sc.nextInt());
				
				System.out.println("Artículo comestible creado " + silla.toString());
				
			case 2:
				Armario arma = new Armario();
				
				System.out.println("Introduzca el color del mueble: ");
			    arma.setColor(sc.toString());
				
				System.out.println("Introduzca el tipo de madre del mueble: ");
				arma.setTipoMadera(sc.toString());
				
				System.out.println("Introduzca el numero de puertas del armario : ");
				arma.setNumPuertas(sc.nextInt());
				
				
				
				System.out.println("Artículo de limpieza creado " + arma.toString());
				
			}
			
		} while (opcionElegida != 0);
	}

	
	/**
	 * 
	 * @return
	 */
	public static int menu () {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		String textoMenu = "\n\n\tMENÚ" +
				"\n0.- Salir" + 
				"\n1.- Crear artículo comestible" + 
				"\n2.- Crear artículo de limpieza";
		
		System.out.println(textoMenu);
		opcion = sc.nextInt();
		return opcion;		
	}
	}


