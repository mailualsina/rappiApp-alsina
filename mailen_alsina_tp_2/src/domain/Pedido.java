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
	
	public void mostrarListaProductos() {
		
		for(Producto producto: productos) {
			
			System.out.println(producto.getNombre());
			
		}
		
	}
		
	
	public double calcularPrecioTotalProductosPedido() {
		
		double totalPrecioProductos = 0;
		for(Producto producto: productos) {
			
			//System.out.println(producto.getPrecio());
			
			double precioProducto = producto.getPrecio();
			totalPrecioProductos = totalPrecioProductos + precioProducto;
				
		}
//		System.out.println("ES EL TOTAL:");
//		System.out.println(totalPrecioProductos);
		return totalPrecioProductos;
		
	}
	
	
	
	public String getNombreCliente() {
		
		return nombreCliente;
		
	}
	
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public void setMedioDePago(String medioDePago) {
		
		this.medioDePago = medioDePago;
		
	}
	
	
}
 