package com.prueba.tecnica.services.impl;

import com.prueba.tecnica.domains.entity.Autor;
import com.prueba.tecnica.repository.AutorRepository;
import com.prueba.tecnica.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    @Override
    public Autor findById(Long id) {
        return autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado con ID: " + id));
    }

    @Override
    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }
}
