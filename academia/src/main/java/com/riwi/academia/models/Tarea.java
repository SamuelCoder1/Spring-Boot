package com.riwi.academia.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(length = 225, nullable = false)
    private String descripcion;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;
    @Column(name = "hora_creacion", nullable = false)
    private LocalDateTime horaCreacion;
    @Column(length = 50,nullable = false)
    private String estado;

    public Tarea() {
    }

    public Tarea(Integer id, String titulo, String descripcion, LocalDate fechaCreacion, LocalDateTime horaCreacion, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.horaCreacion = horaCreacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", horaCreacion=" + horaCreacion +
                ", estado='" + estado + '\'' +
                '}';
    }
}
