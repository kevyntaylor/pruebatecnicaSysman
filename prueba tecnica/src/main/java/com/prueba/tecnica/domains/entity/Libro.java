package com.prueba.tecnica.domains.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Libro")
@Data
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "libro_id")
    private Long id;

    @Column(name = "titulo", nullable = false, length = 255)
    private String titulo;

    @Column(name = "fechaPublicacion", nullable = false, length = 255)
    private String fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;
}
