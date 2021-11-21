package domain;

public class Cliente {

	private String nombre;
	private boolean esPlanPremium;
	private int id;
	private double saldoCliente;
	
	
	public Cliente(String nombre, boolean esPlanPremium, int id, double saldoCliente) {
		
		this.nombre = nombre;
		this.esPlanPremium = esPlanPremium;
		this.id = id;
		this.saldoCliente = saldoCliente;
		
	}
	
	
	
}
