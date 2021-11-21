package service;

import java.util.ArrayList;
import java.util.List;

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
			
			Proveedor p = proveedores.get(i);
			
			if(p.getNombreProveedor().equalsIgnoreCase(nombre)) {
				
				System.out.println("Encontré el proveedor " + nombre + " en la posición " + i);
			} 
			
		}
		
		
		for (Proveedor p : proveedores) {
						
			if(p.getNombreProveedor().equalsIgnoreCase(nombre)) {
				
				System.out.println("Encontré el proveedor " + nombre);
			} 
			
		}
		
			
	}
				
	
	
	public void seleccionarProducto() {
		
		System.out.println("El producto elegido es ");
		
	}
	
}
