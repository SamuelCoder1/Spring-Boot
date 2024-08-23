package com.riwi.eventos.service.impl;

import com.riwi.eventos.models.Eventos;
import com.riwi.eventos.repositories.EventoRepository;
import com.riwi.eventos.service.interfaces.IEventoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventosImpl implements IEventoService {

    @Autowired
    EventoRepository eventRepository;

    @Override
    public Page<Eventos> readByPages(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

    @Override
    public List<Eventos> readAll() {
        return eventRepository.findAll();
    }

    @Override
    public Eventos readById(String id) {
        return eventRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El evento con el id: " + id + " no fue encontrado"));
    }

    @Override
    public Eventos save(Eventos events) {
        return eventRepository.save(events);
    }

    @Override
    public void delete(String id) {
        eventRepository.deleteById(id);
    }
}
