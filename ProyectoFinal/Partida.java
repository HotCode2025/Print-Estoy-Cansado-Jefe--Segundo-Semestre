import java.time.LocalDateTime;

// Partida
public class Partida {

    private Long id;
    private String nombreJugador;
    private int puntajeObtenido;
    private LocalDateTime fecha;
    public Partida() {
    }

    public Partida(Long id, String nombreJugador, int puntajeObtenido, LocalDateTime fecha) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.puntajeObtenido = puntajeObtenido;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
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
