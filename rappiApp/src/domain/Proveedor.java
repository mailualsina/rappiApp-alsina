package domain;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
		
	
	private String nombre;
	private double saldo;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Proveedor(String nombre, double saldo){
		
		this.nombre = nombre;
		this.saldo = saldo;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void mostrarProductos() {
		
		System.out.println("Seleccione los productos que desee comprar:");
		
		for(Producto producto : productos) {
			
			String nombreProducto = producto.getNombre();
			
			System.out.println(nombreProducto);
			
		}
		
	}
	
	
	public Producto obtenerProducto(String nombre) {
			
			for(Producto producto: productos) {
				
				if(producto.getNombre().equalsIgnoreCase(nombre)) {
					
					return producto;
				} 
				
			}
			
			return null;
	}
		
	
	public void cargarProducto(Producto producto) {
		
		productos.add(producto);
		
	}
	
	
}
