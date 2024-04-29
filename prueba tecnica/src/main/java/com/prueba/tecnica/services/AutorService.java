package com.prueba.tecnica.services;

import com.prueba.tecnica.domains.entity.Autor;
import com.prueba.tecnica.domains.entity.Libro;

import java.util.List;

public interface AutorService {

    Autor save(Autor autor);
    Autor findById(Long id);
    void deleteById(Long id);
    List<Autor> findAll();
    Autor update(Autor autor);
}
