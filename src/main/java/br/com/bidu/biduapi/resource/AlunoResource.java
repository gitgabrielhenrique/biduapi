package br.com.bidu.biduapi.resource;

import br.com.bidu.biduapi.model.Aluno;
import br.com.bidu.biduapi.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoResource
{

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/todos")
    public List<Aluno> listarTodosAlunos(){
        return alunoRepository.findAll();

    }




}









