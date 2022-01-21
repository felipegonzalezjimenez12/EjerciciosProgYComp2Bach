package capitulo04OrientacionaObjetosEjemplo02ANIMALES;

public class Mono {
     private String colorpelo;
     private int altura;
     private int numeropatas;
	public Mono() {
		super();
	}
	public Mono(String colorpelo, int altura, int numeropatas) {
		super();
		this.colorpelo = colorpelo;
		this.altura = altura;
		this.numeropatas = numeropatas;
	}
	public String getColorpelo() {
		return colorpelo;
	}
	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getNumeropatas() {
		return numeropatas;
	}
	public void setNumeropatas(int numeropatas) {
		this.numeropatas = numeropatas;
	}
	@Override
	public String toString() {
		return "Mono [colorpelo=" + colorpelo + ", altura=" + altura + ", numeropatas=" + numeropatas + "]";
	}
	
     
}
