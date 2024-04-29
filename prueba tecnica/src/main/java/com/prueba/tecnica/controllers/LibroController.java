package com.prueba.tecnica.controllers;

import com.prueba.tecnica.domains.entity.Libro;
import com.prueba.tecnica.services.LibroService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
@Api(tags = "Libros", description = "Controller para administrar los libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Libro obtenerLibroPorId(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @PutMapping
    public Libro actualizarLibro(@RequestBody Libro libroActualizar) {
        return libroService.update(libroActualizar);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.deleteById(id);
    }
}

