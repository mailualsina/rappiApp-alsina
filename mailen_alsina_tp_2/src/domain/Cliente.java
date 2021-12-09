package domain;

public class Cliente {

	private String nombre;
	private boolean esPlanPremium;
	private int id;
	private double saldo;
	
	
	public Cliente(String nombre, boolean esPlanPremium, int id, double saldo) {
		
		this.nombre = nombre;
		this.esPlanPremium = esPlanPremium;
		this.id = id;
		this.saldo = saldo;
		
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	

	
	
}
