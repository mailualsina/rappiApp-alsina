package service;

import java.util.ArrayList;
import java.util.List;

import domain.Pedido;
import domain.Cliente;
import domain.Producto;
import domain.Proveedor;

public class PedidoService {
	
	
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	
	public void cargarPedido(Pedido pedido) {

		pedidos.add(pedido);
		
	}
	
	//acá lo ideal sería pasarle el número de pedido y todo el pedido
	public void pagarPedido(int numeroPedido, String medioDePago) {
		
		for (Pedido pedido : pedidos) {
			
			if (pedido.getNumero() == numeroPedido) {
				
					pedido.setMedioDePago(medioDePago);	
					
			}
			
		}
		
	}
	
	
	
	
//	public void pagoPedido(List<Producto> productos, Cliente cliente, String nombreProducto) {
//		
//		for (int i=0; i < productos.size(); i++) {
//			
//			Producto producto = productos.get(i);
//			
//			if(producto.getNombre().equalsIgnoreCase(nombreProducto)) {
//				
//				System.out.println("El producto a pagar es " + producto.getNombre());
//				
//				if (cliente.getSaldo() >= producto.getPrecio() && cliente.getEsPlanPremium() == true) {
//					
//					double descuentoPremium = producto.getPrecio() * 10.0/100.0;
//					
//					double precioConDescuento = producto.getPrecio() - descuentoPremium;
//					
//					cliente.setSaldo(cliente.getSaldo() - precioConDescuento);
//					
//					System.out.println("Pago realizado con éxito. Usted ha abonado " + precioConDescuento + " pesos.");
//					
//				} else if (cliente.getSaldo() >= producto.getPrecio() && cliente.getEsPlanPremium() == false) {
//					
//					cliente.setSaldo(cliente.getSaldo() - producto.getPrecio());
//					
//					System.out.println("Pago realizado con éxito. Usted ha abonado " + producto.getPrecio() + " pesos.");
//					
//				} else if (cliente.getSaldo() < producto.getPrecio()){
//					
//					System.out.println("La compra no puede ser realizada ya que el saldo es insuficiente.");
//
//				}
//			} 
//		}
//		 				
//		//Me falta agregarle el valor del producto vendido al proveedor
//		
//	}
	
	
//	public void seleccionarProveedor(List<Proveedor> proveedores, String nombre) {
//	
//		
////		for (int i=0; i < proveedores.size(); i++) {
////			
////			Proveedor proveedor = proveedores.get(i);
////			
////			if(proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
////				
////				System.out.println("El proveedor es " + nombre);
////			} 
////			
////		}
//	
//		
//		for (Proveedor proveedor : proveedores) {
//						
//			if(proveedor.getNombre().equalsIgnoreCase(nombre)) {
//				
//				System.out.println("El proveedor seleccionado es " + nombre);
//			} 
//			
//		}
//		
//			
//	}
//				
//	
//	
//	public void seleccionarProducto(List<Producto> listaProductos, String nombre) {
//		
//		for (Producto productoActual : listaProductos) {
//			
//			if (productoActual.getNombre().equalsIgnoreCase(nombre)) {
//				
//				System.out.println("El producto seleccionado es " + nombre);
//				
//			}
//			
//		}
//	}
//	
	
	
	
	
}
