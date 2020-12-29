package gab.entities;

public class Auto extends Vehiculo {
	private int puertas;

	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	@Override
	public String toString() {
		return "Auto [ Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Puertas: " + getPuertas() + ", Precio: " + getPrecio() + "]" ;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
}
