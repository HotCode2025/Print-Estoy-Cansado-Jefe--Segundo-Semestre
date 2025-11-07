public class Temporizador {
   
    private int tiempoLimiteSegundos;
    private boolean activo;

    public Temporizador() {
    }

    public Temporizador(boolean activo, int tiempoLimiteSegundos) {
        this.activo = activo;
        this.tiempoLimiteSegundos = tiempoLimiteSegundos;
    }

    public int getTiempoLimiteSegundos() {
        return tiempoLimiteSegundos;
    }

    public void setTiempoLimiteSegundos(int tiempoLimiteSegundos) {
        this.tiempoLimiteSegundos = tiempoLimiteSegundos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}