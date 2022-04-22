package com.example.microcorso.controller;


import com.example.microcorso.entity.Corso;
import com.example.microcorso.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corso")
public class CorsoRest {

    @Autowired
    CorsoService corsoService;

    @GetMapping(value = "/{id}")
    public Corso getById(@PathVariable("id") Long id) {
        return corsoService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Corso> getAll() {
        return corsoService.findAll();
    }

    @PostMapping(value = "/new")
    public void newCorso(@RequestBody Corso corso) {
        corsoService.save(corso);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCorsoPerId(@PathVariable("id") Long id) {
        corsoService.delete(id);
    }
}
