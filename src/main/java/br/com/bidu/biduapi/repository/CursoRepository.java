package br.com.bidu.biduapi.repository;

import br.com.bidu.biduapi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CursoRepository extends JpaRepository<Curso,Long > {
}
