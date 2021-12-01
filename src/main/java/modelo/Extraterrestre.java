package modelo;

import java.util.ArrayList;

public class Extraterrestre extends Desastre {
    private String tipo;

    public Extraterrestre(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, ArrayList<Persona> desaparecidos, String tipo) {
        super(lugar, fecha, personas, hora, perdidaEconomica, desaparecidos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
