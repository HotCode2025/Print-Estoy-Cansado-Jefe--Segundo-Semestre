// Partida 
public class Partida {

    private Long id;

    private Usuario usuario;

    private int puntajeObtenido;
    private LocalDateTime fecha;

    public Partida() {
    }

    public Partida(Long id, Usuario usuario, int puntajeObtenido, LocalDateTime fecha) {
        this.id = id;
        this.usuario = usuario;
        this.puntajeObtenido = puntajeObtenido;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}

// Pregunta
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

//Respuesta
public class Respuesta {

    private Long id;

    private String texto;
    private boolean esCorrecta;
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
