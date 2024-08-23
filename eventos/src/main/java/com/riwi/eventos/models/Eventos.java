package com.riwi.eventos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity(name = "eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 100, nullable = false)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @Column(nullable = false)
    @NotNull(message = "La fecha no puede ser nula")
    @FutureOrPresent(message = "La fecha del evento no puede ser en el pasado")
    private LocalDate fecha;

    @NotBlank(message = "La ubicación no puede estar vacía")
    private String ubicacion;

    @Column(nullable = false)
    @NotNull(message = "La capacidad no puede ser nula")
    @Min(value = 0, message = "La capacidad no puede ser negativa")
    private Integer capacidad;

    public Eventos() {
    }

    public Eventos(String id, String nombre, LocalDate fecha, String ubicacion, Integer capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "EVENTOS: " +
                "Id= " + id + "\n" +
                "Nombre= " + nombre + "\n" +
                "Fecha= " + fecha + "\n" +
                "Ubicacion= " + ubicacion + "\n" +
                "Capacidad= " + capacidad
        ;
    }
}
