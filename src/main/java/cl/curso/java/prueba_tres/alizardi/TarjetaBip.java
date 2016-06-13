package cl.curso.java.prueba_tres.alizardi;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Alan
 *
 */
public class TarjetaBip {
	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;

	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	public TarjetaBip() {
		this.numeroTarjeta = 10;
		this.saldo = 1000;
		this.viajes = null;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	/**
	 * 
	 * @param monto
	 *            indica el saldo disponible en la tarjeta Bip.
	 * @method agregara el saldo de la recarga al monto de la tarjeta Bip.
	 */
	public void recargar(int monto) {
		this.setSaldo(this.getSaldo() + monto);
		System.out.println("Saldo cargado");
	}

	/**
	 * 
	 * @param valorViaje
	 *            indica el valor del viaje que se descontara del saldo de la
	 *            tarjeta.
	 * @method si el valor del viaje no es mayor al monto el saldo se
	 *         descontara, si no, lanzara la excepcion SinSaldoException con un
	 *         mensjase.
	 */
	public void pagarViaje(int valorViaje) {
		if (this.getSaldo() < valorViaje) {
			throw new SinSaldoException("Saldo insuficiente");
		} else {
			this.setSaldo(this.getSaldo() - valorViaje);
			viajes.add(new Viaje(new Date(), this.getSaldo(), valorViaje));
			System.out.println("Viaje pagado");
		}
	}

	/**
	 * @method ordena la lista de Viaje y muestra cada uno de sus datos.
	 */
	public void imprimir() {
		Collections.sort(this.getViajes());
		System.out.println("Numero de Tarjeta: " + this.getNumeroTarjeta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("------Viajes------");
		for (Viaje via : viajes) {
			System.out.println(via.toString());
		}
	}

}
