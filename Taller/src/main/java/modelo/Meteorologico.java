package modelo;

import java.util.ArrayList;

public class Meteorologico extends Desastre {
	private String categoria;

	public Meteorologico(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, java.util.ArrayList<Persona> afectados, String categoria) {
		throw new UnsupportedOperationException();
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}
}