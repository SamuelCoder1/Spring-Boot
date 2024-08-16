package com.riwi.academia.service;

import com.riwi.academia.models.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TareaService {

    public List<Tarea> listTareas();
}
