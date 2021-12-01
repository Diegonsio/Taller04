package modelo;

import datos.GestorDatos;
import java.util.ArrayList;

public class Desastre {
	protected String lugar;
	protected String fecha;
	protected String hora;
	protected int perdidaEconomica;
	protected Persona personas;
	protected Persona[]desaparecidos;
	public GestorDatos unnamed_GestorDatos_;

	public Desastre(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, java.util.ArrayList<Persona> desaparecidos) {
		throw new UnsupportedOperationException();
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getHora() {
		return this.hora;
	}

	public void setPerdidaEconomica(int perdidaEconomica) {
		this.perdidaEconomica = perdidaEconomica;
	}

	public int getPerdidaEconomica() {
		return this.perdidaEconomica;
	}

	public void setPersonas(Persona personas) {
		this.personas = personas;
	}

	public Persona getPersonas() {
		return this.personas;
	}

	public void setDesaparecidos(Persona desaparecidos) {
		this.desaparecidos = desaparecidos;
	}

	public Persona getDesaparecidos() {
		return this.desaparecidos;
	}
}