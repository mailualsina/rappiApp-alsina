package service;

import java.util.List;

import domain.Producto;
import domain.Proveedor;

public class PedidoService {
	
	
	public PedidoService() {
		
		
	}
	
	//Le paso una lista de proveedores y un nombre y lo filtro para que me devuelva el supermecado.
	
	public void seleccionarProveedor(List<Proveedor> proveedores, String nombre) {
	
//		Proveedor coto = (Proveedor) proveedores.stream()
//				.filter((p) -> p.getNombreProveedor().equalsIgnoreCase(nombre));
//		
//		System.out.println(coto);
		
		
		for (int i=0; i < proveedores.size(); i++) {
			
			Proveedor proveedor = proveedores.get(i);
			
			if(proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
				
				System.out.println("El proveedor es " + nombre);
			} 
			
		}
		
		
		for (Proveedor proveedor : proveedores) {
						
			if(proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
				
				System.out.println("El proveedor seleccionado es " + nombre);
			} 
			
		}
		
			
	}
				
	
	
	public void seleccionarProducto(List<Producto> listaProductos, String nombre) {
		
		for (Producto productoActual : listaProductos) {
			
			if (productoActual.getNombre().equalsIgnoreCase(nombre)) {
				
				System.out.println("El producto seleccionado es " + nombre);
				
			}
			
		}
	}
	
	
	
	
}
