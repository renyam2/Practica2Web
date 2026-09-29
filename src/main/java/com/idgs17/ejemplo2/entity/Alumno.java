package com.idgs17.ejemplo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity 
public class Alumno {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String matricula;
    private String nombre;
    private Boolean activo;

}
