package cl.curso.java.prueba_tres.alizardi;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 
 * @author Alan
 *
 */
public class App {
	public static void main(String[] args) {
		Viaje v3 = new Viaje(new GregorianCalendar(2016, 06, 14).getTime(), 10000, 720);
		Viaje v1 = new Viaje();
		Viaje v2 = new Viaje(new GregorianCalendar(2016, 06, 11).getTime(), 10000, 720);
		List<Viaje> viajes = new ArrayList<Viaje>();
		viajes.add(v3);
		viajes.add(v1);
		viajes.add(v2);
		TarjetaBip t2 = new TarjetaBip(1, 2500, viajes);
		t2.imprimir();
		System.out.println();
		t2.recargar(1000);
		t2.imprimir();
		System.out.println();
		try {
			t2.pagarViaje(2000);
			t2.imprimir();
			System.out.println();
			t2.pagarViaje(2000);
			t2.imprimir();
		} catch (SinSaldoException r) {
			System.out.println("Error " + r.getMessage());
		}
	}
}
