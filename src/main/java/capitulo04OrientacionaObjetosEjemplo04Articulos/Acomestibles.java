package capitulo04OrientacionaObjetosEjemplo04Articulos;

public class Acomestibles extends Articulos {

	private String caducidad;
	
	public Acomestibles() {
		super();
	}

	public Acomestibles(String nombre, float codigo, float precio , String caducidad) {
		super(nombre, codigo, precio);
		this.caducidad =caducidad;
	}

	@Override
	public String toString() {
		return "Acomestibles [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", caducidad="
				+ caducidad + "]";
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	
	
}
