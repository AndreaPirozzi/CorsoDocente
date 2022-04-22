package com.example.microdocente.service;

import com.example.microdocente.entity.Docente;

import java.util.List;

public interface DocenteService {

    Docente findById(Long id);

    List<Docente> findAll();

    Docente delete(Long id);

    Docente save(Docente docente);
}
