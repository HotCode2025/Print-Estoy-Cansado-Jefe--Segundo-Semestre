package Entidades;

import java.util.List;

@Entity
public class Pregunta {

    private int id;
    private String texto;
    private List<String> opciones;
    private int indiceCorrecto;

    public Pregunta() {
    }

    public Pregunta(int id, String texto, List<String> opciones, int indiceCorrecto) {
        this.id = id;
        this.texto = texto;
        this.opciones = opciones;
        this.indiceCorrecto = indiceCorrecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public int getIndiceCorrecto() {
        return indiceCorrecto;
    }

    public void setIndiceCorrecto(int indiceCorrecto) {
        this.indiceCorrecto = indiceCorrecto;
    }
}
