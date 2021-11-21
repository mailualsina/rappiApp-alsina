import domain.Proveedor;

public class Supermercado extends Proveedor {

	private double saldo;
	
	public Supermercado(String nombre, double saldo) {
		
		super(nombre);
		this.saldo = saldo;
		
	}
	
	public String getNombreSupermercado() {
		
		return nombre;
		
	}
	
}
