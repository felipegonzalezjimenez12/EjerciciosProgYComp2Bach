package capitulo04OrientacionaObjetosEjemplo02ANIMALES;

public class Principal {

	public static void main(String[] args) {
   
		Perro tomy = new Perro();
		tomy.setColorpelo("negro");
        tomy.setRaza("bulldog");	
		tomy.setNumeropatas(4);
		System.out.println(tomy.toString());
		
		
		
		
		Mono cesar = new Mono("marron",70,4);
		System.out.println(cesar.toString());
		
		oso yogi = new oso();
		yogi.setColorpelo("marron");
		yogi.setPatas(4);
		System.out.println(yogi.toString());
	}

}
