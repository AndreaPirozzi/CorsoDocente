package com.example.microdocente.controller;

import com.example.microdocente.entity.Docente;
import com.example.microdocente.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docente")
public class DocenteRest {

    @Autowired
    DocenteService docenteService;

    @GetMapping(value = "/{id}")
    public Docente getById(@PathVariable("id") Long id) {
        return docenteService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Docente> getAll() {
        return docenteService.findAll();
    }

    @PostMapping(value = "/new")
    public void newDocente(@RequestBody Docente docente) {
        Docente.save(docente);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDocentePerId(@PathVariable("id") Long id) {
        docenteService.delete(id);
    }

    @GetMapping(value = "/getNomeDocente/{id}")
    public String getNomeDocenteById(@PathVariable("id") Long id) {
        return docenteService.findById(id).getNomeDocente();
    }
}
