package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import clases.TiempoAnemico;
import clases.TiempoNoAnemico;
import clases.TiempoRecord;

public class Main {

	public static void main(String[] args) {

		// TIEMPO NO ANEMICO
		LocalDate fecha2 = LocalDate.now();

		TiempoNoAnemico fecha = new TiempoNoAnemico(fecha2);

		fecha.fechaFormatoLargo();

		fecha.fechaFormatocorto();

		// TIEMPO ANEMICO

		LocalDate fecha1 = LocalDate.now();
		TiempoAnemico fechaAnemica = new TiempoAnemico(fecha1);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String formatoLargo = formato.format(fechaAnemica.obtenerFecha());
		System.out.println(formatoLargo);

		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd - MM - yyyy");
		String formatoCorto = formato1.format(fechaAnemica.obtenerFecha());
		System.out.println(formatoCorto);

		// Record

		LocalDate fecha3 = LocalDate.now();
		TiempoRecord record = new TiempoRecord(fecha3);

		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String resultado = formato3.format(record.fecha());
		System.out.println(resultado);

		DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("dd - MM - yyyy");
		String resultado1 = formato4.format(record.fecha());
		System.out.println(resultado1);

		/*
		 * 
		 * public void fechaFormatocorto() {
		 * 
		 * DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd - MM - yyyy");
		 * String resultado = formato.format(this.fecha); System.out.println(resultado);
		 * }
		 */

	}

}
