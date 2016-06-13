/**
 * 
 */
package cl.curso.java.prueba_tres.jperez;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Pagar Viaje $500\n" + "2. Immprimir\n"
				+ "3. Pagar Viaje $50000\n" + "4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		List<Viaje> dat = new ArrayList();
		for (int i = 0; i < 10; i++) {
			Viaje lista = new Viaje(new Date(), ((i + 1) * 500), (i * 150));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dat.add(lista);

		}
		TarjetaBip tb = new TarjetaBip(177008796, 10000, dat);
		PagarViaje pv = new PagarViaje();

		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				try {
					int pasaje = 500;
					pv = new PagarViaje(tb, pasaje);
					pv.run();

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case "2":
				pv.getTarjetaBip().imprimir();

				break;

			case "3":
				try {
					int pasaje = 50000;
					pv = new PagarViaje(tb, pasaje);
					pv.run();
				} catch (SinSaldoException sse) {
					sse.printStackTrace();
				}

				break;

			case "4":
				opcionSalir = true;
				JOptionPane.showMessageDialog(null, "Usted ha salido del sistema. Gracias por operar con nosotros.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERROR 404 NOT FOUND ON THE STYSTEM");
				break;
			}
		} while (!opcionSalir);
	}
}
