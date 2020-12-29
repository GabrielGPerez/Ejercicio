package gab.entities;

public class Moto extends Vehiculo{
	private String cilindrada;

	public Moto(String marca, String modelo, double precio, String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return "Moto [ Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Cilindrada: " + getCilindrada() + ", Precio: " + getPrecio() + "]" ;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
