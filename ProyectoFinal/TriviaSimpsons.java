import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class TriviaSimpsons {

    private static final Scanner scanner = new Scanner(System.in);
    private static Partida partidaActual = new Partida(); // Usamos la clase Partida para el estado
    private static ContadorVidas vidas = new ContadorVidas(); // Usamos la clase ContadorVidas
    private static int preguntasContestadas = 0;
    private static final int TOTAL_PREGUNTAS = 20;

    // Se usa el setter de Partida para actualizar el puntaje
    public static void incrementarPuntaje(int puntosExtra) {
        int puntajeActual = partidaActual.getPuntajeObtenido();
        partidaActual.setPuntajeObtenido(puntajeActual + puntosExtra);
    }

    // Se mantiene la estructura de la función MostrarProgreso de PSeInt
    public static void MostrarProgreso(int preguntasContestadas, boolean fueCorrecta) {
        System.out.println("");

        if (fueCorrecta) {
            System.out.println("¡Woo Hoo! es CORRECTA.");
        } else {
            System.out.println("Doh! es INCORRECTA.");
        }

        System.out.println("Llevas " + preguntasContestadas + " de " + TOTAL_PREGUNTAS + " preguntas respondidas.");

        if (fueCorrecta) {
            switch (preguntasContestadas) {
                case 5:
                    System.out.println("¡Tuviste buen arranque!");
                    break;
                case 10:
                    System.out.println("¡Muy bien terminaste el nivel medio!");
                    break;
                case 15:
                    System.out.println("¡Impresionante sos un experto!");
                    break;
                case 20:
                    System.out.println("¡Todo un fan de Los Simpsons!");
                    break;
                default:
                    System.out.println("¡Seguí así, vas por buen camino!");
                    break;
            }
        } else {
            System.out.println("No te rindas, sigue avanzando!");
        }
        System.out.println("");
    }

    // Método que contiene la lógica del juego (Proceso TriviaSimpsons de PSeInt)
    public static void iniciarJuego() {
        boolean continuar = true;

        do {
            limpiarPantalla();
            System.out.println("==============================");
            System.out.println("      THE PSEINTSONS        ");
            System.out.println("==============================");
            System.out.println("1. JUGAR");
            System.out.println("2. REGLAS");
            System.out.println("3. PUNTAJES");
            System.out.println("4. SALIR");
            System.out.println("==============================");
            System.out.print("Ingrese una opcion (1 al 4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Consumir la entrada inválida
                pausar();
                continue;
            }

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    mostrarReglas();
                    break;
                case 3:
                    // Usamos el getter de Partida para obtener el puntaje
                    mostrarPuntajes(partidaActual.getPuntajeObtenido());
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    pausar();
                    break;
            }
        } while (continuar);
    }

    private static void jugar() {
        // Reiniciar estado de la partida y vidas al iniciar
        partidaActual.setPuntajeObtenido(0); // Usamos el setter
        preguntasContestadas = 0;
        vidas = new ContadorVidas(); // Nueva instancia con 3 vidas (o lo que defina el constructor)

        // 1. Mostrar introducción y tutorial (se mantiene la simplificación)
        limpiarPantalla();
        System.out.println("¡Bienvenido! Gracias por animarte a enfrentar esta desafiante trivia.");
        // ... (resto de ASCII art y texto de bienvenida)
        System.out.println("\nPRESIONA ENTER PARA EMPEZAR CON EL TUTORIAL");
        scanner.nextLine();
        tutorial();

        // Cargar todas las preguntas
        List<Pregunta> todasLasPreguntas = cargarPreguntas();

        int[] puntosPorNivel = {50, 100, 150, 200}; // FÁCIL, MEDIA, DIFÍCIL, FAN
        String[] nombresNivel = {"FÁCIL", "MEDIA", "DIFÍCIL", "FAN"};
        int preguntasPorNivel = 5;

        for (int nivel = 0; nivel < 4; nivel++) {
            // Se usa el getter estaVivo() de ContadorVidas
            if (!vidas.estaVivo()) break;

            limpiarPantalla();
            System.out.println("DIFICULTAD " + nombresNivel[nivel] + " (Preguntas " + (nivel * preguntasPorNivel + 1) + " - " + ((nivel + 1) * preguntasPorNivel) + ")");
            System.out.println(obtenerSeparadorPSeInt());

            int correctasNivel = 0; // Contador de correctas por nivel

            for (int i = 0; i < preguntasPorNivel; i++) {
                if (!vidas.estaVivo()) break;

                int indicePregunta = nivel * preguntasPorNivel + i;
                // Obtenemos el objeto Pregunta
                Pregunta preguntaActual = todasLasPreguntas.get(indicePregunta);

                mostrarPreguntaEnmarcada(preguntaActual, indicePregunta + 1);

                String respuestaUsuario;
                do {
                    System.out.print("Tu respuesta (a, b, c): ");
                    respuestaUsuario = scanner.nextLine().toLowerCase();
                } while (!respuestaUsuario.matches("[abc]")); // Validación más concisa

                limpiarPantalla();

                boolean fueCorrecta = false;

                // Usamos el getter getIndiceCorrecto() de Pregunta
                int indiceRespuestaUsuario = respuestaUsuario.charAt(0) - 'a';

                if (indiceRespuestaUsuario == preguntaActual.getIndiceCorrecto()) {
                    incrementarPuntaje(puntosPorNivel[nivel]); // Usamos el setter/método auxiliar
                    correctasNivel++;
                    fueCorrecta = true;
                } else {
                    vidas.perderVida(); // Usamos el método perderVida() de ContadorVidas
                }

                preguntasContestadas++;
                MostrarProgreso(preguntasContestadas, fueCorrecta);

                // Usamos el getter de Partida
                System.out.println("Puntaje acumulado: " + partidaActual.getPuntajeObtenido() + " puntos.");

                if (!vidas.estaVivo()) {
                    System.out.println("\n¡Te has quedado sin vidas! Juego Terminado.");
                    pausar();
                    break;
                }

                System.out.print("Presiona Enter para continuar...");
                scanner.nextLine();
                limpiarPantalla();
            }

            // Mostrar resultados del nivel
            mostrarResultadoNivel(nombresNivel[nivel], correctasNivel, preguntasPorNivel, partidaActual.getPuntajeObtenido()); // Usamos getter de Partida
            System.out.print("Presiona Enter para continuar con la dificultad " +
                    (nivel < 3 ? nombresNivel[nivel + 1] : "FINAL") + "...");
            scanner.nextLine();
            limpiarPantalla();
        }

        // Final de la Trivia
        mostrarResultadoFinal(preguntasContestadas, partidaActual.getPuntajeObtenido()); // Usamos getter de Partida

        // La clase Partida se podría usar para guardar el registro final aquí
        partidaActual.setId(1L); // Ejemplo
        partidaActual.setFecha(LocalDateTime.now()); // Usamos el setter de Partida

        System.out.print("Presiona Enter para regresar al menú principal...");
        scanner.nextLine();
        limpiarPantalla();
    }

    // --- Carga de Preguntas (usando la clase Pregunta) ---
    private static List<Pregunta> cargarPreguntas() {
        List<Pregunta> preguntas = new ArrayList<>();

        // NOTA: Cada pregunta usa el constructor de la clase Pregunta

        // Nivel FÁCIL (Puntos = 50)
        preguntas.add(new Pregunta(1, "¿Cuántos miembros tiene la familia Simpson?", Arrays.asList("5", "4", "7"), 0));
        preguntas.add(new Pregunta(2, "¿Que instrumento toca Lisa?", Arrays.asList("Xilófono", "Flauta", "Saxofón"), 2));
        preguntas.add(new Pregunta(3, "¿Cuál es el nombre del vecino religioso de los Simpson?", Arrays.asList("Ned Flanders", "Barney Gumble", "Moe Szyslak"), 0));
        preguntas.add(new Pregunta(4, "¿De qué color es el vehículo de la familia?", Arrays.asList("Rosado", "Naranja", "Celeste"), 0));
        preguntas.add(new Pregunta(5, "¿Cuáles son las tías de los hijos de Marge?", Arrays.asList("Jacqueline Bouvier y Selma Bouvier", "Selma Bouvier Y Patty Bouvier", "Lisa Bouvier y Edna Bouvier"), 1));

        // Nivel MEDIO (Puntos = 100)
        preguntas.add(new Pregunta(6, "¿Cómo se llaman los bravucones de la escuela de Lisa y Bart?", Arrays.asList("Milhouse V.H, Martin Prince, Todd Flanders, Rafa Gorgori", "Nelson, Jimbo, Kearney, Dolph", "Apu, Moe, Skinner, Edna"), 1));
        preguntas.add(new Pregunta(7, "Completa la frase: -Nada puede-...", Arrays.asList("Pasar", "Salir mal", "Malir Sal"), 2));
        preguntas.add(new Pregunta(8, "¿Cuál es el nombre de los hijos de Ned Flanders?", Arrays.asList("Rod y Todd", "Maggie y Lisa", "Jimbo y Nelson"), 0));
        preguntas.add(new Pregunta(9, "¿Cómo se llama el payaso famoso de la televisión en Springfield?", Arrays.asList("Bozo", "Krusty", "Bob Patiño"), 1));
        preguntas.add(new Pregunta(10, "¿Qué personaje dice frecuentemente -Excelente- mientras junta los dedos?", Arrays.asList("Smithers", "Mr. Burns", "Kent Brockman"), 1));

        // Nivel DIFÍCIL (Puntos = 150)
        preguntas.add(new Pregunta(11, "¿Sin televisión y sin cerveza, Homero qué pierde?", Arrays.asList("Un Bat", "La cabeza", "Magi"), 1));
        preguntas.add(new Pregunta(12, "¿A quién pide ayuda Homero cuando está en problemas?", Arrays.asList("Jebus", "Batman", "Superman"), 0));
        preguntas.add(new Pregunta(13, "¿Qué llevó Bart a Australia y después se hizo una plaga?", Arrays.asList("Un Conejo", "Un Hamster", "Un Sapo"), 2));
        preguntas.add(new Pregunta(14, "¿Qué pescado comió Homero que lo enfermó?", Arrays.asList("Un Pez Espada", "Un Pez Globo", "Un Pez León"), 1));
        preguntas.add(new Pregunta(15, "¿Cuántos hijos tiene Cletus?", Arrays.asList("19", "27", "34"), 2));

        // Nivel FAN (Puntos = 200)
        preguntas.add(new Pregunta(16, "¿En qué regimiento sirvió Abraham Simpson?", Arrays.asList("Crimson Storm Chasers", "Flying Hellfish", "Flying Hellhounds"), 1));
        preguntas.add(new Pregunta(17, "¿En su juventud, de qué trabajaba Mona Simpson?", Arrays.asList("Enfermera", "Asistente", "Activista"), 2));
        preguntas.add(new Pregunta(18, "¿Qué pasa con el billete de un billón de dólares del Sr. Burns?", Arrays.asList("Lo recupera el FBI", "Lo obtiene Fidel Castro", "Se pierde en el agua"), 1));
        preguntas.add(new Pregunta(19, "¿Cuántas veces se separan Homero y Marge en la serie?", Arrays.asList("5", "3", "10"), 0));
        preguntas.add(new Pregunta(20, "¿Cuál es el nombre del grupo musical universitario en el que estuvo el Director Skinner y qué instrumento tocaba?", Arrays.asList("Captain Fantasy and the Soft-Touch Feelings + Bongo", "Borbotones + Guitarra", "Cypress Creek Mens Chorus + Violin"), 0));

        return preguntas;
    }

    // --- Métodos Auxiliares (Tutorial, limpiarPantalla, etc.) se mantienen igual ---
    private static void tutorial() { /* ... */ }
    private static void limpiarPantalla() { /* ... */ }
    private static void pausar() { /* ... */ }
    private static void mostrarReglas() { /* ... */ }
    private static void mostrarPreguntaEnmarcada(Pregunta pregunta, int numeroPregunta) { /* ... */ }
    private static void mostrarResultadoNivel(String nivel, int correctas, int totalNivel, int puntosAcumulados) { /* ... */ }
    private static void mostrarResultadoFinal(int correctas, int puntosAcumulados) { /* ... */ }
    private static void mostrarPuntajes(int puntajeActual) { /* ... */ }
    private static String generarNombreFicticio(int indice) {
        String[] nombres = {"Emir", "Valentin", "Gian", "Fabio", "Lautaro", "Franco", "Roy", "Nicolas", "Abril", "Marcos", "Martin", "Lisa"};

        // Aseguramos que el índice no se salga del array, usando Lisa por defecto si es muy alto
        return nombres[Math.min(indice, nombres.length - 1)];
    }
    private static String obtenerSeparadorPSeInt() {
        return  "_____ .   . .___  .__  __   .___ . . .  . _____   __     __ . . __ \n" +
                "  |  |   | |    |  \\ (__` |    | | \\ |   |    (__`  /   \\ |\\  | (__`\n" +
                "  |  |---| |--- | __/   \\ |--- | | \\ |   |      \\  |  | | \\ |   \\ \n" +
                "  |  |   | |___ |    \\__/ |___ | |  \\|   |   \\__/  \\__/  |  \\| \\__/ ";
    }

    public static void main(String[] args) {
        iniciarJuego();
        scanner.close();
    }
}