package capitulo04OrientacionaObjetosEjemplo04Articulos;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int menu;
		int opcionElegida;
		
		System.out.println("Men�");
		System.out.println("0.- Salir");
		System.out.println("1.- Crear articulo comestible");
		System.out.println("2.- Crear articulo de limpieza");
	
		Scanner sc = new Scanner (System.in);
		menu = sc.nextInt();
	
		
		
		do {
			
			
			
			opcionElegida = menu;
			switch  (opcionElegida) {
			case 1: 
				Acomestibles acomestible = new Acomestibles();
				
				System.out.println("codigo");
				acomestible.setCodigo(sc.nextFloat());
				System.out.println("precio");
				acomestible.setPrecio(sc.nextFloat());
				System.out.println("caducidad");
				acomestible.setCaducidad(sc.toString());
				System.out.println("Artículo de limpieza creado " + acomestible.toString());

			case 2:
				Alimpieza alimpieza = new Alimpieza();
				
				System.out.println("codigo");
				alimpieza.setCodigo(sc.nextFloat());
				System.out.println("precio");
				alimpieza.setPrecio(sc.nextFloat());
				System.out.println("ignifugo");
				alimpieza.setIgnifugo(sc.nextBoolean());
				System.out.println("Artículo de limpieza creado " + alimpieza.toString());

			}
			
		}
		while(opcionElegida != 0) ;
		return;
		}
		
		
		
		
		
		
		
		
		
	
	}


