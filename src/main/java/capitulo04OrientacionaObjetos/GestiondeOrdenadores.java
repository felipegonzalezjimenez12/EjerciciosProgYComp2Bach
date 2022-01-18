package capitulo04OrientacionaObjetos;

public class GestiondeOrdenadores {

	public static void main(String[] args) {
		Ordenador java = new Ordenador();
		java.setAltura(50);
		java.setAnchura(80);
		java.setColor("negro");
		java.setMarca("fujitsu");
        System.out.println(java.toString());
	}

}
