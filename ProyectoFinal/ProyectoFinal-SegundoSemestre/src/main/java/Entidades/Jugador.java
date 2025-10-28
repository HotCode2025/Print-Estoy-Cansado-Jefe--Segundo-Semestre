package Entidades;

import java.util.List;

@Entity
public class Jugador {

    @Id
    private int id;
    private int puntajeTotal;
    private String nombre;

    public Jugador() {
    }

    public Jugador(int id, int puntajeTotal, String nombre) {
        this.id = id;
        this.puntajeTotal = puntajeTotal;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}