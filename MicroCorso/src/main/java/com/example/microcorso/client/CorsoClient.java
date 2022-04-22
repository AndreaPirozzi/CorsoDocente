package com.example.microcorso.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ApplicationCorso", url = "http://localhost:8080")
public interface CorsoClient {

    @GetMapping(value = "/api/docente/getNomeDocenteById/{id}")
    String getNomeDocente(@PathVariable("id") Long id);
}
