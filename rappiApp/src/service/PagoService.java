package service;

import java.util.List;

import domain.Cliente;
import domain.Producto;
import domain.Proveedor;

public class PagoService {

	
	public PagoService() {
		
			
		
	}
	
	public void pagoPedido(List<Producto> productos, Cliente cliente, String nombre) {
		
		for (int i=0; i < productos.size(); i++) {
			
			Producto producto = productos.get(i);
			
			if(producto.getNombre().equalsIgnoreCase(nombre)) {
				
				System.out.println("El producto a pagar es " + producto.getNombre());
				
				if (cliente.getSaldo() >= producto.getPrecio() && cliente.getEsPlanPremium() == true) {
					
					double descuentoPremium = producto.getPrecio() * 10.0/100.0;
					
					producto.setPrecio(producto.getPrecio() - descuentoPremium);
					
					cliente.setSaldo(cliente.getSaldo() - producto.getPrecio());
					
					System.out.println("Pago realizado con éxito. Usted ha abonado " + producto.getPrecio() + " pesos.");
					
				} else if (cliente.getSaldo() >= producto.getPrecio() && cliente.getEsPlanPremium() == false) {
					
					cliente.setSaldo(cliente.getSaldo() - producto.getPrecio());
					
					System.out.println("Pago realizado con éxito. Usted ha abonado " + producto.getPrecio() + " pesos.");
					
				} else if (cliente.getSaldo() < producto.getPrecio()){
					
					System.out.println("La compra no puede ser realizada ya que el saldo es insuficiente.");

				}
			} 
		}
		 				
		
		
	}
	
	
}	
