package modelo;

import java.util.ArrayList;

public class Biologico extends Desastre {
	private String tipo;
	private float mortalidad;

	public Biologico(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, java.util.ArrayList<Persona> afectados, String tipo, float mortalidad) {
		throw new UnsupportedOperationException();
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setMortalidad(float mortalidad) {
		this.mortalidad = mortalidad;
	}

	public float getMortalidad() {
		return this.mortalidad;
	}
}