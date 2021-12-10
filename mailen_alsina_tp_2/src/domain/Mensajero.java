package domain;

import java.util.ArrayList;
import java.util.List;

public class Mensajero {
	
	private String nombre;
	private double saldo;
	private boolean estaDisponible;
	
	
	public Mensajero(String nombre, double saldo) {
		
		this.nombre = nombre;
		this.saldo = saldo;
		
	}


	public String getNombre() {
		return nombre;
	}



	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	

	

}
