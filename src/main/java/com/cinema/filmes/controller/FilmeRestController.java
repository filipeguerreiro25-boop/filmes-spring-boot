package com.cinema.filmes.controller;

import com.cinema.filmes.model.Filme;
import com.cinema.filmes.repository.FilmeRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeRestController {

    private final FilmeRepository repository;

    public FilmeRestController(FilmeRepository repository) {
        this.repository = repository;
    }

    // GET listar todos
    @GetMapping
    public List<Filme> listar() {
        return repository.findAll();
    }

    // GET por id
    @GetMapping("/{id}")
    public Filme buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // POST  cadastrar
    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return repository.save(filme);
    }

    // PUT  atualizar
    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Long id,
                           @RequestBody Filme filmeAtualizado) {

        Filme filme = repository.findById(id).orElse(null);

        if (filme != null) {

            filme.setTitulo(filmeAtualizado.getTitulo());
            filme.setSinopse(filmeAtualizado.getSinopse());
            filme.setGenero(filmeAtualizado.getGenero());
            filme.setAnoLancamento(
                    filmeAtualizado.getAnoLancamento()
            );

            return repository.save(filme);
        }

        return null;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}