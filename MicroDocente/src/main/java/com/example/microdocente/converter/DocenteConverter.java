package com.example.microdocente.converter;

import com.example.microdocente.dto.DocenteDto;
import com.example.microdocente.entity.Docente;

import java.util.ArrayList;
import java.util.List;

public class DocenteConverter {
    public DocenteDto toDto(Docente docente) {
        DocenteDto dto = new DocenteDto();
        dto.setCognome(docente.getCognome());
        dto.setNome(docente.getNome());

        return dto;
    }

    public List<DocenteDto> listToDto(List<Docente> lista){

        List<DocenteDto> listaDto= new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            listaDto.add(toDto(lista.get(i)));
        }

        return listaDto;
    }
}
