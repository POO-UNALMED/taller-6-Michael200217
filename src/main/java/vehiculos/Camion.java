package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	public Camion(){
		this.puertas=2;
		this.velocidadMaxima=80;
		this.traccion="4x2";
		cantidadCamion++;
	}
	public Camion(String placa, String nombre, int precio, int peso,Fabricante fabricante,int ejes){
		this.placa=placa;
		this.puertas=2;
		this.velocidadMaxima=80;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion="4x2";
		this.fabricante=fabricante;
		this.ejes=ejes;
		cantidadCamion++;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
