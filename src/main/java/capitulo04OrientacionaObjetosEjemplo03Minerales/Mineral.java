package capitulo04OrientacionaObjetosEjemplo03Minerales;

public class Mineral {
 
	private float dureza;
	private String color;
	
	@Override
	public String toString() {
		return "Mineral [dureza=" + dureza + ", color=" + color + "]";
	}

	public Mineral() {
		super();
	}
	public Mineral(float dureza, String color) {
		super();
		this.dureza = dureza;
		this.color = color;
	}
	
	
	public float getDureza() {
		return dureza;
	}
	public void setDureza(float dureza) {
		this.dureza = dureza;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
