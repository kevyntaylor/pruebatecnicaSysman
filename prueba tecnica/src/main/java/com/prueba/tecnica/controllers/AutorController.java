package com.prueba.tecnica.controllers;
import com.prueba.tecnica.domains.entity.Autor;
import com.prueba.tecnica.services.AutorService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/autores")
@Api(tags = "Autores", description = "Controller para administrar los autores de los libros.")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.save(autor);
    }

    @GetMapping
    public List<Autor> obtenerTodosLosAutores() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Autor obtenerAutorPorId(@PathVariable Long id) {
        return autorService.findById(id);
    }

    @PutMapping
    public Autor actualizarAutor(@RequestBody Autor autor) {
        return autorService.update(autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        autorService.deleteById(id);
    }
}

