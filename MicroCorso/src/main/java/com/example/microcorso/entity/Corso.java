package com.example.microcorso.entity;

import com.example.microdocente.entity.Docente;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "CORSO1")
public class Corso {
    @Column
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nome;

    @Column
    private LocalDate data_inizio;

    @Column
    private int durata;

    @ManyToOne
    @JoinColumn(name = "id_docente", referencedColumnName = "id")
    private Docente docente;
}
