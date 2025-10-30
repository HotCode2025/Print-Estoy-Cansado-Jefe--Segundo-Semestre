package Repositorios;

import Entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public class JugadorRepositorio {

    // Para acceder a estos métodos: findAll(), findById(), save(), deleteById() En caso de ser necesario
        public interface JugadorRepository extends JpaRepository<Pregunta, Long> {
        }
}
