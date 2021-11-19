import java.util.ArrayList;
import java.util.List;

import domain.Licoreria;
import domain.Producto;
import domain.Proveedor;
import domain.Rappi;


public class Principal {

	public static void main(String[] args) {
		
		
		List<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto("Leche", 25, 60));
		productos.add(new Producto("Pan",30,25));
		
		
		List<Proveedor> proveedores = new ArrayList<Proveedor>();

		proveedores.add(new Proveedor("Coto"));
		proveedores.add(new Proveedor("Jing A"));

	
	}
}
