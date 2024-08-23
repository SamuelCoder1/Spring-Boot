package com.riwi.eventos.controllers.impl;

import com.riwi.eventos.controllers.interfaces.IEventoController;
import com.riwi.eventos.models.Eventos;
import com.riwi.eventos.service.interfaces.IEventoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/eventos")
@ResponseBody
public class EventoController implements IEventoController {

    @Autowired
    IEventoService eventService;

    @Override
    @PostMapping("/create")
    public ResponseEntity<Eventos> create(@RequestBody @Valid Eventos events) {
        return ResponseEntity.ok(eventService.save(events));
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        eventService.delete(id);
    }

    @Override
    @GetMapping("/pages")
    public ResponseEntity<List<Eventos>> readByPages(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Eventos> eventosPage = eventService.readByPages(pageable);

        List<Eventos> eventosList = eventosPage.getContent();

        return ResponseEntity.ok(eventosList);
    }

    @Override
    @GetMapping
    public List<Eventos> readAll() {
        return eventService.readAll();
    }

    @Override
    @GetMapping("/{id}")
    public Eventos readById(@PathVariable String id) {
        return eventService.readById(id);
    }

    @Override
    @PostMapping("/update/{id}")
    public ResponseEntity<Eventos> update(@PathVariable String id,@RequestBody @Valid Eventos eventos) {
        if (eventService.readById(id) != null) {
            eventos.setId(id);
            Eventos updatedEvent = eventService.save(eventos);
            return ResponseEntity.ok(updatedEvent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
