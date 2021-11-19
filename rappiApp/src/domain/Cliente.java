package domain;

public class Cliente {

	private String nombre;
	private boolean esPlanPremium;
	private boolean esPlanSimple;
	private int id;
	private double saldoCliente;
	
	
	public Cliente(String nombre, boolean esPlanPremium, boolean esPlanSimple, int id, double saldoCliente) {
		
		this.nombre = nombre;
		this.esPlanPremium = esPlanPremium;
		this.esPlanSimple = esPlanSimple;
		this.id = id;
		this.saldoCliente = saldoCliente;
		
	}
	
	
}
