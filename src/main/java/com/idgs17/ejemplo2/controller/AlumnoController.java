package com.idgs17.ejemplo2.controller;

import com.idgs17.ejemplo2.repository.AlumnoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idgs17.ejemplo2.entity.Alumno;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping ("/api/alumnos")
public class AlumnoController {
    private final AlumnoRepository alumnoRepository;
    AlumnoController(AlumnoRepository alumnoRepository, AlumnoRepository AlumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    @PostMapping("path")
    public ResponseEntity<Alumno> postMethodName(@RequestBody Alumno entity) {
        Alumno alumno = new Alumno();
        alumno.setMatricula(entity.getMatricula());
        alumno.setNombre(entity.getNombre());
        alumno.setActivo(entity.getActivo());
        alumnoRepository.save(alumno);

        return ResponseEntity.ok(alumno);
    }
    
}
