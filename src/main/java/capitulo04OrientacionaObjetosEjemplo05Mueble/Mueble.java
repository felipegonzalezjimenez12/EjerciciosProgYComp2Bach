package capitulo04OrientacionaObjetosEjemplo05Mueble;

public class Mueble {

	protected String color;
	protected String tipoMadera;
	
	public Mueble(String color, String tipoMadera) {
		super();
		this.color = color;
		this.tipoMadera = tipoMadera;
	}
	public Mueble() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}
	@Override
	public String toString() {
		return "Mueble [color=" + color + ", tipoMadera=" + tipoMadera + "]";
	}
	
}
