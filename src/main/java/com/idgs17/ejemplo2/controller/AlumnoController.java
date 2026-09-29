package com.idgs17.ejemplo2.controller;

import com.idgs17.ejemplo2.repository.AlumnoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idgs17.ejemplo2.entity.Alumno;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AlumnoController {
    private final AlumnoRepository alumnoRepository;
    AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @GetMapping("/")
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Bienvenido a la API de Alumnos. Usa /api/alumnos/path");
    }

    @GetMapping("/api/alumnos/path")
    public ResponseEntity<java.util.List<Alumno>> getMethodName() {
        return ResponseEntity.ok(alumnoRepository.findAll());
    }

    @PostMapping("/api/alumnos/path")
    public ResponseEntity<Alumno> postMethodName(@RequestBody Alumno entity) {
        Alumno alumno = new Alumno();
        alumno.setMatricula(entity.getMatricula());
        alumno.setNombre(entity.getNombre());
        alumno.setActivo(entity.getActivo());
        alumnoRepository.save(alumno);

        return ResponseEntity.ok(alumno);
    }
    
}
