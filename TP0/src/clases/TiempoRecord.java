package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record TiempoRecord(LocalDate fecha) {

	public void fechaFormatoLargo() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String resultado = formato.format(this.fecha);
		System.out.println(resultado);

	}

	public void fechaFormatocorto() {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd - MM - yyyy");
		String resultado = formato.format(this.fecha);
		System.out.println(resultado);
	}
}
