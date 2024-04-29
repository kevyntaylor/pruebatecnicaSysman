package com.prueba.tecnica.domains.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Autor")
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
}
