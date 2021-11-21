import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Licoreria;
import domain.Producto;
import domain.Proveedor;
import domain.Rappi;
import domain.Restaurante;
import service.PedidoService;


public class Principal {

	public static void main(String[] args) {
		
		
		List<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto("Leche", 25, 60));
		productos.add(new Producto("Pan", 30, 25));
		
		
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		
		proveedores.add(new Supermercado("Jumbo", 40000));
		proveedores.add(new Supermercado("Coto", 40000));
		proveedores.add(new Restaurante("Jing A", 50000));

		
		Cliente victoria = new Cliente("Victoria", false, 472, 2000);
		
		
		PedidoService pedido = new PedidoService();
		
		pedido.seleccionarProveedor(proveedores,"Coto");
		
		//System.out.println(pedido.seleccionarProveedor(proveedores,"Coto"));
		
		
		
		
		//pedido.seleccionarProducto(Producto)
		
		

		
	}
}
