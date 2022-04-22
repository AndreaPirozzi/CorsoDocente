package com.example.microcorso.service;

import com.example.microcorso.entity.Corso;
import com.example.microcorso.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService{

    @Autowired
    CorsoRepository corsoRepository;

    @Override
    public Corso findById(Long id) {
        Corso corso = corsoRepository.findById(id).get();
        return corso;
    }

    @Override
    public List<Corso> findAll() {
        return corsoRepository.findAll();
    }

    @Override
    public Corso delete(Long id) {
        Corso corso = corsoRepository.findById(id).get();
        corsoRepository.delete(corso);
        return corso;
    }

    @Override
    public Corso save(Corso corso) {
        return corsoRepository.save(corso);
    }
}
