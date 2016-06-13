package cl.curso.java.prueba_tres.jperez;

import java.util.Date;

/**
 * @author Joseph Perez Carmona
 *
 */

public class Viaje implements Comparable<Viaje> {

	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;

	/**
	 * Constructor que recibe parametros
	 * 
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	/**
	 * Constructor Que inicializa parametros (:
	 * 
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje() {
		super();
		this.fecha = new Date();
		this.saldoTarjeta = 0;
		this.valorViaje = 0;
	}

	/**
	 * Retorna el valor de fecha
	 * 
	 * @return fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Setea el parametro fecha segun el parametro fecha
	 * 
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Retorna el valor de saldoTarjeta
	 * 
	 * @return saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	/**
	 * Setea el parametro saldoTarjeta segun el parametro saldoTarjeta
	 * 
	 * @param saldoTarjeta
	 *            the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
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

	/**
	 * Implementacion del metodo compareTo Retorna si las fechas son iguales
	 * (0), si es mas nueva(1) o antigua(-1).
	 */
	public int compareTo(Viaje o) {
		return this.getFecha().compareTo(o.getFecha());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nfecha = " + fecha + "\nsaldoTarjeta = " + saldoTarjeta + "\nvalorViaje = " + valorViaje;
	}

}
