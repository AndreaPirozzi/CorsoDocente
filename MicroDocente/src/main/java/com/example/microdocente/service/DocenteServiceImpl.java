package com.example.microdocente.service;

import com.example.microdocente.entity.Docente;
import com.example.microdocente.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public Docente findById(Long id) {
        Docente docente = docenteRepository.findById(id).get();
        return docente;
    }

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente delete(Long id) {
        Docente docente = docenteRepository.findById(id).get();
        docenteRepository.delete(docente);
        return docente;
    }

    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

}



