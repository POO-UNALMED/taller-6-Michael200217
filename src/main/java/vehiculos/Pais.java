package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
	ArrayList<Pais> contador = new ArrayList<Pais>();
	Pais mayor,mayorf;
	int x=0,ymayor=0;
	public Pais(String nombre){
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		Pais x=new Pais("ecuador");
		return x;
	}

}
