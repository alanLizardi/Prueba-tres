package cl.curso.java.prueba_tres.alizardi;

import java.util.Date;
/**
 * 
 * @author Alan
 *
 */
public class Viaje implements Comparable<Viaje> {
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;

	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	public Viaje() {
		this.fecha = new Date();
		this.saldoTarjeta = 5000;
		this.valorViaje = 210;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public int getValorViaje() {
		return valorViaje;
	}

	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	@Override
	public String toString() {
		return "Viaje [fecha=" + fecha + ", saldoTarjeta=" + saldoTarjeta + ", valorViaje=" + valorViaje + "]";
	}
	
	public int compareTo(Viaje viaje) {
		return this.getFecha().compareTo((viaje).getFecha());
	}
}
