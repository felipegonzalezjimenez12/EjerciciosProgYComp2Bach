package capitulo04OrientacionaObjetosEjemplo05Mueble;

public class Armario extends Mueble{

	private int numPuertas;

	public Armario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Armario(String color, String tipoMadera) {
		super(color, tipoMadera);
		// TODO Auto-generated constructor stub
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Armario [numPuertas=" + numPuertas + ", color=" + color + ", tipoMadera=" + tipoMadera + "]";
	}
	
	
}
