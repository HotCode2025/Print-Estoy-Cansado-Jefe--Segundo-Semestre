package Entidades;

import java.util.List;

@Entity
public class Partida {

    @Id
    private Long id;

    @ManyToOne
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
