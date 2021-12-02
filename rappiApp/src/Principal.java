import domain.Cliente;
import domain.Pedido;
import domain.Producto;
import domain.Proveedor;
import domain.ProveedorService;
import service.PedidoService;


public class Principal {

	public static void main(String[] args) {
		
		
		
		Proveedor supermercado = new Proveedor("Coto", 15000);
		
		supermercado.cargarProducto(new Producto("pan", 100));
		supermercado.cargarProducto(new Producto("leche", 60));
		supermercado.cargarProducto(new Producto("aceite", 45));
		supermercado.cargarProducto(new Producto("yerba", 250));
		
		
		Proveedor restaurante = new Proveedor("Renatto", 5000);
		
		restaurante.cargarProducto(new Producto("ravioles", 240));
		restaurante.cargarProducto(new Producto("ñoquis", 260));
		restaurante.cargarProducto(new Producto("fideos", 190));
		restaurante.cargarProducto(new Producto("queso rallado", 210));

		
		Proveedor licoreria = new Proveedor("Paradiso", 10000);
	
		licoreria.cargarProducto(new Producto("fernet", 1800));
		licoreria.cargarProducto(new Producto("tequila", 580));
		licoreria.cargarProducto(new Producto("ron", 3500));
		licoreria.cargarProducto(new Producto("vodka", 1400));
		
		
		ProveedorService proveedorService = new ProveedorService();
		
		proveedorService.cargarProveedor(licoreria);
		proveedorService.cargarProveedor(supermercado);
		proveedorService.cargarProveedor(restaurante);
		
		
		//Cliente Victoria decide comprar en Coto dentro del Pedido 1
		
		Cliente victoria = new Cliente("Victoria", false, 123, 2500);
		
		proveedorService.mostrarProveedores();
		Proveedor proveedorSeleccionado = proveedorService.seleccionarProveedor(victoria, "Coto");
				
		proveedorSeleccionado.mostrarProductos();
				
		Producto productoObtenido1 = proveedorSeleccionado.obtenerProducto("pan");
		Producto productoObtenido2 = proveedorSeleccionado.obtenerProducto("aceite");
		
		
		Pedido pedido1 = new Pedido(1, "Victoria");
		
		pedido1.cargarProductoAcomprar(productoObtenido1);
		pedido1.cargarProductoAcomprar(productoObtenido2);
		
		//Cliente Victoria decide, ahora, comprar en un restaurante, dentro del mismo
		//Pedido 1

		proveedorService.mostrarProveedores();
		Proveedor proveedorSeleccionado2 = proveedorService.seleccionarProveedor(victoria, "Renatto");
		
		proveedorSeleccionado2.mostrarProductos();
		
		Producto productoObtenido3 = proveedorSeleccionado2.obtenerProducto("ravioles");
		Producto productoObtenido4 = proveedorSeleccionado2.obtenerProducto("queso rallado");
		Producto productoObtenido5 = proveedorSeleccionado2.obtenerProducto("fideos");

		pedido1.cargarProductoAcomprar(productoObtenido3);
		pedido1.cargarProductoAcomprar(productoObtenido4);
		pedido1.cargarProductoAcomprar(productoObtenido5);
		
		System.out.println("");
		System.out.println("A continuación se mostrarán la lista de productos a comprar: ");
		pedido1.mostrarListaProductos();
		
		
		PedidoService pedidoService = new PedidoService();
		
		pedidoService.cargarPedido(pedido1);
		pedidoService.pagarPedido(1, "tarjeta de crédito");
		
		
		
		
		
		
		
		

		
		//recorrer la lista de proveedores para mostrar todos los proveedores al cliente 
		//para mostrarle en un menú todos los productos disponibles del proveedor
		// ahí ese producto lo mando como argumento adentro del pedido
		
		//Mostrar los productos que quiero comprar
		//Cuando elijo el producto que quiero comprar debería llamar al método
		//productoAcomprar
		//Circuito: Elijo un producto, ese producto lo tengo que guardar en algún lado
		//y después se lo paso como argumento a 
		//Pedido pedido1 = new Pedido(1,"Mailén");
		//pedido1.cargarProductoAcomprar(ACA PASO el producto);
		
		
		//PedidoService pedidosService= new PedidoService();
		
		//Pedido pedido1 = new Pedido(1, "Mailén");
		//pedido1.cargarProductoAComprar(new Producto("pan"));
		
		//Pedido pedido2 = new Pedido(2, "Mailén");
		//pedido2.cargarProductoAComprar(new Producto("pan"));
		
		
		//pedidoService.cargarPedido(pedido1)
		//pedidoService.cargarPedido(pedido2)
		
		
		
		
		

	
//		Cliente victoria = new Cliente("Victoria", false, 472, 2000);
//		
//		
//		PedidoService pedido = new PedidoService();
//		
//		pedido.seleccionarProveedor(proveedores,"Coto");
//		pedido.seleccionarProducto(productos, "Pan");
//		
//		
//		PagoService pago = new PagoService();
//		
//		pago.pagoPedido(productos, victoria, "Pan");
//		
		
		
		
		
		
		

		
	}
}
