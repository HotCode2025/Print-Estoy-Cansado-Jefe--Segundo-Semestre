public class Temporizador {

    private int tiempoLimiteSegundos;
    private boolean activo;
    private Thread hilo;
    private Runnable accionAlTerminar;

    public Temporizador() {
    }

    public Temporizador(boolean activo, int tiempoLimiteSegundos, Runnable accionAlTerminar) {
        this.activo = activo;
        this.tiempoLimiteSegundos = tiempoLimiteSegundos;
        this.accionAlTerminar = accionAlTerminar;
    }

    // Getters y Setters
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

    public Runnable getAccionAlTerminar() {
        return accionAlTerminar;
    }

    public void setAccionAlTerminar(Runnable accionAlTerminar) {
        this.accionAlTerminar = accionAlTerminar;
    }

    // Iniciar el temporizador
    public void iniciar() {

        if (activo) {
            System.out.println("El temporizador ya está en marcha.");
            return;
        }

        activo = true;

        hilo = new Thread(() -> {
            int tiempoRestante = tiempoLimiteSegundos;

            while (activo && tiempoRestante > 0) {
                System.out.println("⏳ Tiempo restante: " + tiempoRestante + "s");
                tiempoRestante--;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("El temporizador fue interrumpido.");
                    return;
                }
            }

            activo = false;

            if (tiempoRestante == 0 && accionAlTerminar != null) {
                accionAlTerminar.run();
            }

        });

        hilo.start();
    }

    // Detener el temporizador
    public void detener() {
        activo = false;
        if (hilo != null) {
            hilo.interrupt();
        }
        System.out.println("⏹️ Temporizador detenido.");
    }
}