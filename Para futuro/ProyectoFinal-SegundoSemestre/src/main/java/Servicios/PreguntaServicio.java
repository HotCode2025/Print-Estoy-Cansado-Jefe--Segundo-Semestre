package Servicios;
import Entidades.Pregunta;
import Repositorios.PreguntaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class PreguntaServicio {

    @Autowired
    private PreguntaRepositorio.PreguntaRepository preguntaRepositorio;

    //findAll util para obtener todas las preguntas, esto gracias a JpaRepository que aloja todas estas herramientas.
    public List<Pregunta> obtenerTodas(){
        return preguntaRepositorio.findAll();
    }

    // findById sirve para obtener las preguntas por Id.
    public Optional<Pregunta> obtenerPorId(Long id){
        return preguntaRepositorio.findById(id);
    }
    // Agregar una nueva pregunta
    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepositorio.save(pregunta);
    }

    // Eliminar una pregunta
    public void eliminarPregunta(Long id) {
        preguntaRepositorio.deleteById(id);
    }

    // Obtener una pregunta aleatoria
    public Pregunta obtenerPreguntaAleatoria() {
        List<Pregunta> todas = preguntaRepositorio.findAll();
        if (todas.isEmpty()) return null;

        Random random = new Random();
        return todas.get(random.nextInt(todas.size()));
    }





}
