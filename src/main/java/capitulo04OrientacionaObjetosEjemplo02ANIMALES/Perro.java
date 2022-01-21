package capitulo04OrientacionaObjetosEjemplo02ANIMALES;

public class Perro {
  private int alturacm;
  private String colorpelo;
  private int numeropatas;
  private String raza;

  
  public Perro() {
	super();
}
  public int getAlturacm() {
	return alturacm;
}
public void setAlturacm(int alturacm) {
	this.alturacm = alturacm;
}
public String getColorpelo() {
	return colorpelo;
}
public void setColorpelo(String colorpelo) {
	this.colorpelo = colorpelo;
}
public int getNumeropatas() {
	return numeropatas;
}
public void setNumeropatas(int numeropatas) {
	this.numeropatas = numeropatas;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}
public Perro(int alturacm, String colorpelo, int numeropatas, String raza) {
	super();
	this.alturacm = alturacm;
	this.colorpelo = colorpelo;
	this.numeropatas = numeropatas;
	this.raza = raza;
}
@Override
public String toString() {
	return "Perro [alturacm=" + alturacm + ", colorpelo=" + colorpelo + ", numeropatas=" + numeropatas + ", raza="
			+ raza + "]";
}
  
  
}
