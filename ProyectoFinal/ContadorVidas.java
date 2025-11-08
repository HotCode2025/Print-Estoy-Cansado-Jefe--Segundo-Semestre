//Contador de Vidas
public class ContadorVidas {

    private int vidas;

    // Constructor: el jugador empieza con 3 vidas
    public ContadorVidas() {
        this.vidas = 3;
    }

    // Método para restar una vida
    public void perderVida() {
        if (vidas > 0) {
            vidas--;
            System.out.println("❌ Perdiste una vida. Te quedan " + vidas + " vidas.");
        } else {
            System.out.println("💀 ¡Juego terminado! No te quedan vidas.");
        }
    }

    // Método para verificar si el jugador sigue vivo
    public boolean estaVivo() {
        return vidas > 0;
    }

    // Getter
    public int getVidas() {
        return vidas;
    }
}
