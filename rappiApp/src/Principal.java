import java.util.ArrayList;
import java.util.List;

import bases.Licoreria;
import bases.Restaurante;
import bases.Supermercado;
import derivadas.Coto;
import derivadas.Disco;
import derivadas.Jumbo;
import interfaces.Local;

public class Principal {

	public static void main(String[] args) {
		
		
		List<Local> locales = new ArrayList<Local>();
		
		locales.add(new Supermercado());
		locales.add(new Restaurante());
		locales.add(new Licoreria());
		
	
		List<Supermercado> supermercados = new ArrayList<Supermercado>();
		
		supermercados.add(new Coto());
		supermercados.add(new Disco());
		supermercados.add(new Jumbo());
		
		
		System.out.println((supermercados.get(0)));
		System.out.println((supermercados.get(1)));
		System.out.println((supermercados.get(2)));

		for (int i=0 ; i < supermercados.size(); i++) {
			
			System.out.println((supermercados.get(i)));

			
		}
		
		
	}
}
