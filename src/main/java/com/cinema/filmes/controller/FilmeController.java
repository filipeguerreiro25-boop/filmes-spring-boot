package com.cinema.filmes.controller;

import com.cinema.filmes.model.Analise;
import com.cinema.filmes.model.Filme;
import com.cinema.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FilmeController {

    private final FilmeRepository repository;

    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("filmes", repository.findAll());

        return "index";
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model) {

        model.addAttribute("filme", new Filme());

        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvar(Filme filme) {

        repository.save(filme);

        return "redirect:/";
    }

    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {

        Filme filme = repository.findById(id).orElse(null);

        model.addAttribute("filme", filme);
        model.addAttribute("novaAnalise", new Analise());

        return "detalhes";
    }

    @PostMapping("/analise/{id}")
    public String adicionarAnalise(@PathVariable Long id,
                                   Analise analise) {

        Filme filme = repository.findById(id).orElse(null);

        if (filme != null) {

            filme.getAnalises().add(analise);

            repository.save(filme);
        }

        return "redirect:/detalhes/" + id;
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

    Filme filme = repository.findById(id).orElse(null);

    model.addAttribute("filme", filme);

    return "editar";
}
}