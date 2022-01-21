package capitulo04OrientacionaObjetosEjemplo02ANIMALES;

public class animal {
 
	private String colorpelo;
	private int patas;
	@Override
	public String toString() {
		return "animal [colorpelo=" + colorpelo + ", patas=" + patas + "]";
	}
	public String getColorpelo() {
		return colorpelo;
	}
	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public animal() {
		super();
	}
	public animal(String colorpelo, int patas) {
		super();
		this.colorpelo = colorpelo;
		this.patas = patas;
	}
}
