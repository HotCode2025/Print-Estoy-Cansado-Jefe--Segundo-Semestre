package Entidades;

import java.util.List;

@Entity
public class Respuesta {

    private Long id;

    private String texto;
    private boolean esCorrecta;

    @ManyToOne
    private Pregunta pregunta;

    public Respuesta() {
    }

    public Respuesta(Long id, String texto, boolean esCorrecta, Pregunta pregunta) {
        this.id = id;
        this.texto = texto;
        this.esCorrecta = esCorrecta;
        this.pregunta = pregunta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
}