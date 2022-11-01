package br.com.bidu.biduapi.resource;

import br.com.bidu.biduapi.model.Curso;
import br.com.bidu.biduapi.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Cursos")
public class CursoResource {

    @Autowired
    private CursoRepository cursoRepository;

public List<Curso> listarTodosCursos(){
    return
}


}
