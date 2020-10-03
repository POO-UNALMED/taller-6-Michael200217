package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	public Camioneta(){
		velocidadMaxima=90;
		traccion="4X4";
		cantidadCamioneta++;
	}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		this.placa=placa;
		this.velocidadMaxima=90;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion="4X4";
		this.fabricante=fabricante;
		this.volco=volco;
		cantidadCamioneta++;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
