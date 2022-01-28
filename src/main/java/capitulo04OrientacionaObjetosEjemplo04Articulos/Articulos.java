package capitulo04OrientacionaObjetosEjemplo04Articulos;

public class Articulos {
 
	protected String nombre;
    protected float codigo;
    protected float precio;
	
    public Articulos(String nombre, float codigo, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public Articulos() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCodigo() {
		return codigo;
	}

	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulos [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
    
    
}
