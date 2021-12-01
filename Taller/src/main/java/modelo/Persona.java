package modelo;

public class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		throw new UnsupportedOperationException();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}
}