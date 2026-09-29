package com.idgs17.ejemplo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idgs17.ejemplo2.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    

}


