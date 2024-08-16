package com.riwi.academia.controllers;

import com.riwi.academia.models.Tarea;
import com.riwi.academia.repositories.TareaRepository;
import com.riwi.academia.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping({"/tareas"})
    public String listarTareas(Model modelo){
        modelo.addAttribute("tareas", tareaService.listTareas());
        return modelo.toString();
    }

    /*@CrossOrigin
    @GetMapping
    public List<Tarea> getAllTareas(){
        return tareaRepository.findAll();
    }





    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> getTarea(@PathVariable Integer id) {
        Optional<Tarea> tarea = tareaRepository.findById(id);
        return tarea.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //La anotacion CroosOrigin sirve para hacer el manejo
    // de las peticiones, permitir o denegar el acceso a ellas
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Tarea> createTarea(@RequestBody Tarea tarea) {
        Tarea savedtarea = tareaRepository.save(tarea);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedtarea);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarea(@PathVariable Integer id) {
        if (!tareaRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        tareaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarea> updateTarea(@PathVariable Integer id, @RequestBody Tarea updatedtarea){
        if (!tareaRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        updatedtarea.setId(id);
        Tarea savedtarea = tareaRepository.save(updatedtarea);

        return ResponseEntity.ok(savedtarea);
    }*/

}
