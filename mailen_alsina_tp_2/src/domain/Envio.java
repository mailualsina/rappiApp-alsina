package domain;

import java.util.ArrayList;
import java.util.List;

public class Envio {
	
	private String nombreMensajero;
	private int numeroPedido;
	private String nombreCliente;
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	
	public Envio(String nombreMensajero, int numeroPedido, String nombreCliente) {
		
		this.nombreMensajero = nombreMensajero;
		this.nombreCliente = nombreCliente;
		this.numeroPedido = numeroPedido;
		
	}
	
	
	
	
	
	

}
