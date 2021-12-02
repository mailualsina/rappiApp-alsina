package domain;

import java.util.ArrayList;
import java.util.List;

public class ProveedorService {
	
	
	
	private List<Proveedor> proveedores = new ArrayList<Proveedor>();
	
	
	public void cargarProveedor(Proveedor proveedor) {
		
		proveedores.add(proveedor);
		
	}
	
	public void mostrarProveedores() {
		
		System.out.println("¡Hola! Por favor, seleccione un proveedor:");
		
		for(Proveedor proveedor : proveedores) {
			
			String nombreProveedor = proveedor.getNombre();
			
			System.out.println(nombreProveedor);
			
		}
		
	}
	
	public Proveedor seleccionarProveedor(Cliente cliente, String nombreProveedor) {
		
		for(Proveedor proveedor : proveedores) {
			
			if(proveedor.getNombre().equalsIgnoreCase(nombreProveedor)) {
				
				System.out.println("El proveedor seleccionado es " + nombreProveedor);
			
				return proveedor;
		}
		
	}
		return null;
	
	}
	
	
}