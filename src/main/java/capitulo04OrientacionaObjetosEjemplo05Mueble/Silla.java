package capitulo04OrientacionaObjetosEjemplo05Mueble;

public class Silla extends Mueble{
  
	private int numPatas;

	public Silla() {
		super();
		
	}

	public Silla(String color, String tipoMadera) {
		super(color, tipoMadera);
	
	}

	@Override
	public String toString() {
		return "Silla [numPatas=" + numPatas + ", color=" + color + ", tipoMadera=" + tipoMadera + "]";
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
}
