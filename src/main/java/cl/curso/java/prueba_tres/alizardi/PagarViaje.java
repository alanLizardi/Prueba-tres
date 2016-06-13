package cl.curso.java.prueba_tres.alizardi;

/**
 * 
 * @author Alan
 *
 */
public class PagarViaje extends Thread {
	private TarjetaBip tarjetaBip;
	private int valorViaje;

	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}

	public PagarViaje() {
		this.tarjetaBip = new TarjetaBip();
		this.valorViaje = 500;

	}

	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}

	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}

	public int getValorViaje() {
		return valorViaje;
	}

	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	/**
	 * @method llama al metodo PagarViaje de la clase TarjetaBip.
	 */
	@Override
	public void run() {
		tarjetaBip.pagarViaje(this.getValorViaje());
	}
}
