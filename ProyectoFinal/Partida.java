import java.time.LocalDateTime;

// Partida
public class Partida {

    private Long id;
    private int puntajeObtenido;
    private LocalDateTime fecha;

    public Partida() {
    }

    public Partida(Long id, int puntajeObtenido, LocalDateTime fecha) {
        this.id = id;

        this.puntajeObtenido = puntajeObtenido;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
