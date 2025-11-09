import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


public class Puntuacion {
    private List<Partida> puntajes;
    private Long siguienteId;

    public Puntuacion(){
        this.puntajes = new ArrayList<>();
        this.siguienteId = 1L;
        cargarPredefinidos();
    }


    private void cargarPredefinidos(){
        String[] nombres = {"Emir", "Valentin", "Gian", "Fabio", "Lautaro", "Franco", "Roy", "Nicolas", "Abril", "Marcos", "Martin", "Lisa"};

        //Creamos partidas predefinidas con nombres y puntajes aleatorios
        for (int i = 0; i < nombres.length; i++) {
            //Puntajes entre 1200 y 2700 asi el rango es creíble para el juego
            int puntajeAleatorio = 1200 + (int)(Math.random() * 1501);

            puntajes.add(new Partida(
                    siguienteId++,
                    nombres[i],
                    puntajeAleatorio,
                    LocalDateTime.now().minusDays(i + 1)
            ));
        }

        ordenarPuntajes();
    }

    public void guardarPuntaje(String nombreJugador, int puntajeObtenido){
        Partida nuevoPuntaje = new Partida(siguienteId++, nombreJugador, puntajeObtenido, LocalDateTime.now());
        puntajes.add(nuevoPuntaje);
        ordenarPuntajes();
    }

    private void ordenarPuntajes(){
        //Para ordenar de menor a mayor
        for (int i = 0; i < puntajes.size()-1; i++){
            for (int j = 0; j < puntajes.size() - i - 1; j++){
                if (puntajes.get(j).getPuntajeObtenido() < puntajes.get(j+1).getPuntajeObtenido()){
                    Partida temp = puntajes.get(j);
                    puntajes.set(j, puntajes.get(j+1));
                    puntajes.set(j+1, temp);
                }
            }
        }
    }

    public void mostrarPuntajes(){
        System.out.println("================================================");
        System.out.println("            CLASIFICACIÓN DE PUNTAJES           ");
        System.out.println("================================================");
        System.out.println(" #   JUGADOR           PUNTOS      FECHA");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < puntajes.size(); i++) {
            Partida partida = puntajes.get(i);
            String fecha = partida.getFecha().toLocalDate().toString();
            System.out.printf("%2d. %-15s %5d pts   %s%n",
                    i + 1,
                    partida.getNombreJugador(),
                    partida.getPuntajeObtenido(),
                    fecha);
        }
        System.out.println("================================================");
    }
}
