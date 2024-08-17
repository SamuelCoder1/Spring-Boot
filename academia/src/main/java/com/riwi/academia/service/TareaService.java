package com.riwi.academia.service;

import com.riwi.academia.models.Tarea;
import com.riwi.academia.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService{
    @Autowired
    private TareaRepository repository;
    public List<Tarea> readAllTareas() {
        return repository.findAll();
    }

    public Optional<Tarea> readTareaById(Integer id){
        return repository.findById(id);
    }

    public void create(Tarea tarea){
        repository.save(tarea);
    }

    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }
    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Tarea update(Integer id, Tarea updatedTarea){
        updatedTarea.setId(id);
        Tarea savedTarea = repository.save(updatedTarea);
        return updatedTarea;
    }

    /*public ResponseEntity<Tarea> createMovie(Tarea tarea) {
        return null;
    }*/
}
