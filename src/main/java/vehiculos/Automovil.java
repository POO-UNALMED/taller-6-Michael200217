package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	public Automovil(){
		puertas=4;
		velocidadMaxima=100;
		traccion="FWD";
		cantidadAutomovil++;
	}
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		this.placa=placa;
		this.puertas=4;
		this.velocidadMaxima=100;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion="fwd";
		this.fabricante=fabricante;
		this.puestos=puestos;
		cantidadAutomovil++;
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
