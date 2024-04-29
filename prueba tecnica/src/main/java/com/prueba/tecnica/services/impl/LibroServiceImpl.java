package com.prueba.tecnica.services.impl;

import com.prueba.tecnica.domains.entity.Libro;
import com.prueba.tecnica.repository.LibroRepository;
import com.prueba.tecnica.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado con ID: " + id));
    }

    @Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public Libro update(Libro libro) {
        Libro libroresult = libroRepository.findById(libro.getId())
                .orElseThrow(() -> new RuntimeException("Libro no encontrado con ID: " + libro.getId()));
        libroresult.setTitulo(libro.getTitulo());
        libroresult.setFechaPublicacion(libro.getFechaPublicacion());
        libroresult.setAutor(libro.getAutor());
        return libroRepository.save(libroresult);
    }
}
