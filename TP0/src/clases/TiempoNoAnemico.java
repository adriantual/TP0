package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
	private LocalDate fecha;

	public TiempoNoAnemico(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

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
