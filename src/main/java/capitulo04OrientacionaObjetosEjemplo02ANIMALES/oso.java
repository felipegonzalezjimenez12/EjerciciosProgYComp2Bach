package capitulo04OrientacionaObjetosEjemplo02ANIMALES;

public class oso extends animal {
  int numgarras;

public int getNumgarras() {
	return numgarras;
}

public void setNumgarras(int numgarras) {
	this.numgarras = numgarras;
}

@Override
public String toString() {
	return "oso [numgarras=" + numgarras + "]";
}
	
}
