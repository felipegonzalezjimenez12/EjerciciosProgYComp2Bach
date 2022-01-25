package capitulo04OrientacionaObjetosEjemplo03Minerales;

public class Cuarzo extends Mineral {

	int cristalizacion;
	
	public Cuarzo(float dureza, String color) {
		super(dureza, color);
	}

	public Cuarzo() {
		super();
	}

	@Override
	public String toString() {
		return "Cuarzo [cristalizacion=" + cristalizacion + "]";
	}

}
