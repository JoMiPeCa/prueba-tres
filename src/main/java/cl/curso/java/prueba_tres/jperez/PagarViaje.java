/**
 * 
 */
package cl.curso.java.prueba_tres.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class PagarViaje extends Thread {

	private TarjetaBip tarjetaBip;
	private int valorViaje;

	/**
	 * Constructor Que recibe parametros (:
	 * 
	 * @param tarjetaBip
	 * @param valorViaje
	 */
	public PagarViaje(TarjetaBip tarjetaBip, int valorViaje) {
		super();
		this.tarjetaBip = tarjetaBip;
		this.valorViaje = valorViaje;
	}

	/**
	 * Constructor Que inicializa parametros (:
	 */
	public PagarViaje() {
		super();
		this.tarjetaBip = null;
		this.valorViaje = 0;
	}

	/**
	 * Retorna el valor de tarjetaBip
	 * 
	 * @return tarjetaBip
	 */
	public TarjetaBip getTarjetaBip() {
		return tarjetaBip;
	}

	/**
	 * Setea el parametro tarjetaBip segun el parametro tarjetaBip
	 * 
	 * @param tarjetaBip
	 *            the tarjetaBip to set
	 */
	public void setTarjetaBip(TarjetaBip tarjetaBip) {
		this.tarjetaBip = tarjetaBip;
	}

	/**
	 * Retorna el valor de valorViaje
	 * 
	 * @return valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * Setea el parametro valorViaje segun el parametro valorViaje
	 * 
	 * @param valorViaje
	 *            the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		this.tarjetaBip.pagarViaje(this.valorViaje);
	}

}
