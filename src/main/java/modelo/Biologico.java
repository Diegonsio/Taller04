package modelo;

import java.util.ArrayList;

public class Biologico extends Desastre{
    private String tipo;
    private float mortalidad;

    public Biologico(String lugar, String fecha, String hora, int perdidaEconomica, ArrayList<Persona> desaparecidos, String tipo, float mortalidad) {
        super(lugar, fecha, hora, perdidaEconomica, desaparecidos);
        this.tipo = tipo;
        this.mortalidad = mortalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(float mortalidad) {
        this.mortalidad = mortalidad;
    }
}
