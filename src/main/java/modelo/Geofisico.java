package modelo;

import java.util.ArrayList;

public class Geofisico extends Desastre  {
    private int magnitud;
    private int profundidadEpicentro;


    public Geofisico(String lugar, String fecha, Persona personas, String hora, int perdidaEconomica, ArrayList<Persona> desaparecidos, int magnitud, int profundidadEpicentro) {
        super(lugar, fecha, personas, hora, perdidaEconomica, desaparecidos);
        this.magnitud = magnitud;
        this.profundidadEpicentro = profundidadEpicentro;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }

    public int getProfundidadEpicentro() {
        return profundidadEpicentro;
    }

    public void setProfundidadEpicentro(int profundidadEpicentro) {
        this.profundidadEpicentro = profundidadEpicentro;
    }
}
