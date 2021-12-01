package modelo;

import java.util.ArrayList;

public class Extraterrestre extends Desastre {
	private String tipo;

	public Extraterrestre(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, java.util.ArrayList<Persona> afectados, String tipo) {
		throw new UnsupportedOperationException();
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}
}