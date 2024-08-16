package com.riwi.academia.service;

import com.riwi.academia.models.Tarea;
import com.riwi.academia.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceIMP implements TareaService{

    @Autowired
    private TareaRepository repository;

    @Override
    public List<Tarea> listTareas() {

        return repository.findAll();
    }
}
