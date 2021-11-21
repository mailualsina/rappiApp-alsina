package domain;

public class Restaurante extends Proveedor{
	
	private String nombre;
	private double saldo;
	
	public Restaurante(String nombre, double saldo) {
		
		super(nombre);
		this.saldo = saldo;
		
	}

}
