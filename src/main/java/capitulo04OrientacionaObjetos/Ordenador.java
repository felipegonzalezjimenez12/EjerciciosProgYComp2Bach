package capitulo04OrientacionaObjetos;

public class Ordenador {
 boolean esPortatil;
 private int altura;
 private int anchura;
 private String color;
 private String marca;
 
 public String toString() {
	 
	 return "Propiedades son altura: "  +  altura  +  "anchura: "  
	 +  anchura  +  "marca:" +  marca  +  "color:"  +  color; 
	 
 }

  public void setColor (String newColor) {
	  color = newColor  ;
  }
  public String getColor() {
	  return color; 
  }
  
  
  
  public void setAltura (int newAltura) {
	  altura = newAltura; 
  }
  public int getAltura () {
	  return altura; 
  }
  
  
  
  public void setAnchura (int newAnchura) {
	  anchura = newAnchura;
  }
  public int getAnchura () {
	 return anchura;
  }

  
  
  
  public void setMarca (String newMarca) {
	  marca = newMarca;
  }
  public String getMarca() {
	  return marca;  
  }
}
