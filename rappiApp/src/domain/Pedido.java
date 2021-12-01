package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numero;
	private String nombreCliente;
	private String medioDePago;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public Pedido(int numero, String nombreCliente) {
		
		this.numero = numero;
		this.nombreCliente = nombreCliente;

	}
	
	public void cargarProductoAcomprar(Producto producto) {
		
		productos.add(producto);
		
	}

	public int getNumero() {
		
		return numero;
		
	}
	
	public void setMedioDePago(String medioDePago) {
		
		this.medioDePago = medioDePago;
		
	}
	
	
}
 