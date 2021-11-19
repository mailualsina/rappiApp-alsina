package domain;

public class Mensajero {

	private String nombre;
	private int saldo;
	private boolean estaDisponible;
	
	
	public Mensajero(String nombre, int saldo, boolean estaDisponible) {
		
		this.nombre = nombre;
		this.saldo = saldo;
		this.estaDisponible = estaDisponible;
		
	}
}
