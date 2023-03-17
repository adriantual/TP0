package clases;

import java.time.LocalDate;

public class TiempoAnemico {
	private LocalDate fecha;

	public TiempoAnemico(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate obtenerFecha() {
		return fecha;
	}

	public void cambiarFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
