package modelo;

import java.util.ArrayList;

public class Geofisico extends Desastre {
	private int magnitud;
	private int profundidadEpicentro;

	public Geofisico(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, java.util.ArrayList<Persona> afectados, int magnitud, int profundidadEpicentro) {
		throw new UnsupportedOperationException();
	}

	public void setMagnitud(int magnitud) {
		this.magnitud = magnitud;
	}

	public int getMagnitud() {
		return this.magnitud;
	}

	public void setProfundidadEpicentro(int profundidadEpicentro) {
		this.profundidadEpicentro = profundidadEpicentro;
	}

	public int getProfundidadEpicentro() {
		return this.profundidadEpicentro;
	}
}