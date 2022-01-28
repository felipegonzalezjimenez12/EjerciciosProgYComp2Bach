package capitulo04OrientacionaObjetosEjemplo04Articulos;

public class Alimpieza extends Articulos{

	 private boolean ignifugo = true;
	
	public Alimpieza() {
		super();
	}

	public Alimpieza(String nombre, float codigo, float precio, boolean ignifugo) {
		super(nombre, codigo, precio);
		this.ignifugo = ignifugo;
	}

	@Override
	public String toString() {
		return "Alimpieza [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", ignifugo=" + ignifugo
				+ "]";
	}

	public boolean isIgnifugo() {
		return ignifugo;
	}

	public void setIgnifugo(boolean ignifugo) {
		this.ignifugo = ignifugo;
	}

	
}
