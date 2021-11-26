import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Licorera;
import domain.Producto;
import domain.Proveedor;
import domain.Rappi;
import domain.Restaurante;
import service.PagoService;
import service.PedidoService;


public class Principal {

	public static void main(String[] args) {
		
		
		List<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto("Leche", 100));
		productos.add(new Producto("Pan", 60));
		productos.add(new Producto("Yerba", 450));

		
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		
		proveedores.add(new Supermercado("Jumbo", 4000));
		proveedores.add(new Supermercado("Coto", 9500));
		proveedores.add(new Restaurante("Jing A", 5250));
		proveedores.add(new Licorera("Hermanos", 2000));

		
		Cliente victoria = new Cliente("Victoria", false, 472, 2000);
		
		
		PedidoService pedido = new PedidoService();
		
		pedido.seleccionarProveedor(proveedores,"Coto");
		pedido.seleccionarProducto(productos, "Pan");
		
		
		PagoService pago = new PagoService();
		
		pago.pagoPedido(productos, victoria, "Pan");
		
		
		
		
		
		
		

		
	}
}
