package com.example.microdocente.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DOCENTE1")
public class Docente {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String nome;

    @Column
    private String cognome;

}
