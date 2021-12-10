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
	

	public Pedido obtenerPedido(int numeroPedido) {
		
		for(int i=0; i < pedidos.size(); i++) {
			
			Pedido pedido = pedidos.get(i);
			
			if (pedido.getNumero() == numeroPedido) {
				
				return pedido;
				
			}
		}
		return null;
	}
	
	
	public Cliente obtenerCliente(String nombreCliente) {
	
							
			for(int i=0; i < clientes.size(); i++) {
				
				Cliente cliente = clientes.get(i);
				
				if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
				
					return cliente;
					
				}	
			}
			return null;	
	}
	
	
	
	//Asumo que existe por lo menos un pedido realizado por un cliente
	//y que el número de pedido existe
	
	public boolean pagarPedido(int numeroPedido, String medioDePago) {
		
		boolean pedidoPagado = false;
				
		Pedido pedido = obtenerPedido(numeroPedido);
		Cliente cliente = obtenerCliente(pedido.getNombreCliente());
		
		
		double valorApagar = pedido.PrecioTotalProductosPedido();
		
		if (cliente.getSaldo() >= valorApagar) {
			
			cliente.setSaldo(cliente.getSaldo() - valorApagar);
			
			pedido.setMedioDePago(medioDePago);
			double saldoClienteActual = cliente.getSaldo();
			
			System.out.println("Usted, " + cliente.getNombre() +
					", ha pagado una suma de " + valorApagar +
					", con el método de pago " + medioDePago +
					". Su saldo, actual es: " + saldoClienteActual);	
						
			pedidoPagado = true;
						
		}
		return pedidoPagado;
	}
	
	
}
