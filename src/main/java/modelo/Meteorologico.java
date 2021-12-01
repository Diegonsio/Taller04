package modelo;

import java.util.ArrayList;

public class Meteorologico extends Desastre {
    private String categoria;

    public Meteorologico(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, ArrayList<Persona> desaparecidos, String categoria) {
        super(lugar, fecha, personas, hora, perdidaEconomica, desaparecidos);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
