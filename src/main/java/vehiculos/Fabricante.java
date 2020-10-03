package vehiculos;

public class Fabricante {
	String nombre;
	Pais pais;
	public Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais=pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Fabricante fabricaMayorVentas() {
		Pais xy=new Pais("Ecuador");
		Fabricante x=new Fabricante("Renault",xy);
		return x;
	}
}
