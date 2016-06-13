/**
 * 
 */
package cl.curso.java.prueba_tres.jperez;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Joseph Perez Carmona
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;

	/**
	 * Constructor Que recibe parametros (:
	 * 
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	/**
	 * Constructor Que inicializa parametros (:
	 * 
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip() {
		super();
		this.numeroTarjeta = 0;
		this.saldo = 0;
		this.viajes = null;
	}

	/**
	 * Retorna el valor de numeroTarjeta
	 * 
	 * @return numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * Setea el parametro numeroTarjeta segun el parametro numeroTarjeta
	 * 
	 * @param numeroTarjeta
	 *            the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * Retorna el valor de saldo
	 * 
	 * @return saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * Setea el parametro saldo segun el parametro saldo
	 * 
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * Retorna el valor de viajes
	 * 
	 * @return viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * Setea el parametro viajes segun el parametro viajes
	 * 
	 * @param viajes
	 *            the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	/**
	 * Metodo que recarga la tarjeta con el monto solicitado.
	 * 
	 * @param monto
	 */
	public void recargar(int monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	/**
	 * Metodo Que descuenta saldo segun el valorViaje
	 * 
	 * @param valorViaje
	 */
	public synchronized void pagarViaje(int valorViaje) {
		if (this.getSaldo() < valorViaje) {
			throw new SinSaldoException("Saldo Insuficiente");
		} else {
			this.setSaldo(this.getSaldo() - valorViaje);
			Viaje v = new Viaje(new Date(), this.getSaldo(), valorViaje);
			this.viajes.add(v);
		}
	}

	/**
	 * Metodo que Muestra por consola numero tarjeta, saldo y viajes.
	 */
	public void imprimir() {
		Collections.sort(this.getViajes());
		System.out.println("Numero Tarjeta: " + this.getNumeroTarjeta());
		System.out.println("Saldo Tarjeta: " + this.getSaldo());
		for (Viaje viaje : viajes) {
			System.out.println(viaje.toString());
			System.out.println("\n");
		}
	}
}
