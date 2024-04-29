package com.prueba.tecnica.services;

import com.prueba.tecnica.domains.entity.Libro;

import java.util.List;

public interface LibroService {
    Libro save(Libro libro);
    Libro findById(Long id);
    void deleteById(Long id);
    List<Libro> findAll();
    Libro update(Libro libro);
}
