package service;

import java.util.ArrayList;
import java.util.List;

import domain.Envio;
import domain.Mensajero;
import domain.Pedido;

public class EnvioService {
	
	private List<Mensajero> mensajeros = new ArrayList<Mensajero>();
	private List<Envio> envios = new ArrayList<Envio>();
	
	
	public void cargarEnvio(Envio envio, Mensajero mensajero) {
		
		envios.add(envio);
		mensajeros.add(mensajero);
		
	}
	
	public Envio obtenerEnvio(int numero) {
		
		for(int i=0; i < envios.size(); i++) {
			
			Envio envio = envios.get(i);
			
			if (envio.getNumero() == numero) {
				
				return envio;
				
			}
		}
		return null;
	}
	

	
	public Mensajero obtenerMensajero(String nombre) {
		
		for(int i=0; i < mensajeros.size(); i++) {
			
			Mensajero mensajero = mensajeros.get(i);
			
			if (mensajero.getNombre().equalsIgnoreCase(nombre)) {
				
				return mensajero;
				
			}
			
		}
		return null;
	}
	
	
	
	//Por cada envío que hace el mensajero se le pagan 300 pesos fijos
	
	public void hacerEnvio(int numero) {
		
		Envio envio = obtenerEnvio(numero);
		Mensajero mensajero = obtenerMensajero(envio.getNombreMensajero());
		
		mensajero.setSaldo(mensajero.getSaldo() + 300);
		
		envios.remove(envio);
		
	}
	
}
	
