package com.example.microcorso.service;

import com.example.microcorso.entity.Corso;

import java.util.List;

public interface CorsoService {

    Corso findById(Long id);

    List<Corso> findAll();;

    Corso delete(Long id);

    Corso save(Corso corso);
}
