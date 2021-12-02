package service;

import java.util.ArrayList;
import java.util.List;

import domain.Pedido;


public class PedidoService {
	
	
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void cargarPedido(Pedido pedido) {

		pedidos.add(pedido);
		
	}
	
	
	
	public void pagarPedido(int numeroPedido, String medioDePago) {
		
		for (Pedido pedido : pedidos) {
			
			if (pedido.getNumero() == numeroPedido ) {
				
					pedido.setMedioDePago(medioDePago);	
					
			System.out.println("Su pedido se ha pagado correctamente con el medio de pago " + medioDePago);
					
			}
		
			
			
		}
		
	}
	
	
	
}
