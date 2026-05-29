package com.edusmart.edusmart.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cursos_base")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "nombre_curso", length = 120, unique = true, nullable = false)
    private String nombreCurso;

    @Column(name = "precio_usd")
    private BigDecimal precioUsd;

    @Column(name = "horas_duracion")
    private Integer horasDuracion;
}