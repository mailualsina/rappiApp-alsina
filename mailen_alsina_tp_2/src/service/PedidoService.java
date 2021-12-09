package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Pedido;


public class PedidoService {
	
	
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<Cliente> clientes =new ArrayList<Cliente>();
	
	public void cargarPedido(Pedido pedido, Cliente cliente) {

		pedidos.add(pedido);
		clientes.add(cliente);
		
	}
	

	
	public Cliente obtenerClienteDelPedido(int numeroPedido) {
		
		for(int i=0; i < pedidos.size(); i++) {
			
			Pedido pedido = pedidos.get(i);
			
			if (pedido.getNumero() == numeroPedido) {
							
				for(int j=0; j < clientes.size(); j++) {
					
					Cliente cliente = clientes.get(j);
					
					if (cliente.getNombre() == pedido.getNombreCliente()) {
					
						return cliente;
						
					}	
				}
			}
		}
		return null;	
	}
	
	
	
	public Pedido obtenerPedido(int numeroPedido) {
		
		for(int i=0; i < pedidos.size(); i++) {
			
			Pedido pedido = pedidos.get(i);
			
			if (pedido.getNumero() == numeroPedido) {
				
				return pedido;
				
			}
		}
		return null;
	}
	
	
	
	
	public void pagarPedido(int numeroPerdido, String medioDePago) {
		
		Pedido pedido = obtenerPedido(numeroPerdido);
		Cliente cliente = this.obtenerClienteDelPedido(numeroPerdido);

		pedido.calcularPrecioTotalProductosPedido();
		
		double valorApagar = pedido.calcularPrecioTotalProductosPedido();

		cliente.setSaldo(cliente.getSaldo() - valorApagar);
		
		double saldoClienteActual = cliente.getSaldo();
		pedido.setMedioDePago(medioDePago);
		
		System.out.println("Usted, " + cliente.getNombre() 
		+ ", ha pagado una suma de " + valorApagar 
				+ ", con el método de pago " + medioDePago + ". Su saldo, actual es: " 
		+ saldoClienteActual);	
		
	}
	
	
}
