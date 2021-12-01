package modelo;

import java.util.ArrayList;

public class Desastre {

    protected String lugar;
    protected String fecha;
    protected String hora;
    protected int perdidaEconomica;
    protected ArrayList<Persona> desaparecidos;


    public Desastre(String lugar, String fecha, String hora, int perdidaEconomica, ArrayList<modelo.Persona> desaparecidos) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.perdidaEconomica = perdidaEconomica;
        this.desaparecidos = desaparecidos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPerdidaEconomica() {
        return perdidaEconomica;
    }

    public void setPerdidaEconomica(int perdidaEconomica) {
        this.perdidaEconomica = perdidaEconomica;
    }

    public ArrayList<Persona> getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(ArrayList<Persona> desaparecidos) {
        this.desaparecidos = desaparecidos;
    }
}
