package com.riwi.academia.controllers;

import com.riwi.academia.models.Tarea;
import com.riwi.academia.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public String listarTareas(Model modelo) {
        List<Tarea> tareas = tareaService.readAllTareas();
        modelo.addAttribute("tareas", tareas);
        return "tareas";
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public String getTarea(@PathVariable Integer id, Model modelo) {
        Optional<Tarea> tarea = tareaService.readTareaById(id);
        if (tarea.isEmpty()) {
            return "empty";
        }
        List<Tarea> arrayEmpty = new ArrayList<>();
        arrayEmpty.add(tarea.get());
        modelo.addAttribute("tareas", arrayEmpty);
        return "tareas";
    }

    //La anotacion CroosOrigin sirve para hacer el manejo
    // de las peticiones, permitir o denegar el acceso a ellas
    @CrossOrigin
    @GetMapping("/create")
    public String showFormTarea(Model modelo) {
        modelo.addAttribute("tarea", new Tarea());
        return "create";
    }

     @PostMapping("/create")
    public String createTarea(@ModelAttribute Tarea tarea){
        tareaService.create(tarea);
        return "redirect:/tareas";
    }

    @PostMapping("/delete/{id}")
    public String deleteTarea(@PathVariable Integer id) {
        if (!tareaService.existsById(id)) {
            return "redirect:/tareas";
        }
        tareaService.delete(id);
        return "redirect:/tareas";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Optional<Tarea> tarea = tareaService.readTareaById(id);
        if (tarea.isPresent()) {
            model.addAttribute("tarea", tarea.get());
            return "edit";
        }
        return "redirect:/tareas";
    }

    @PostMapping("/edit")
    public String updateTarea(@ModelAttribute Tarea tarea) {
        tareaService.update(tarea.getId(), tarea);
        return "redirect:/tareas";
    }

//
//    @PutMapping("/{id}")
//    public ResponseEntity<Tarea> updateTarea(@PathVariable Integer id, @RequestBody Tarea updatedtarea){
//        if (!tareaRepository.existsById(id)){
//            return ResponseEntity.notFound().build();
//        }
//
//        updatedtarea.setId(id);
//        Tarea savedtarea = tareaRepository.save(updatedtarea);
//
//        return ResponseEntity.ok(savedtarea);
//    }*/

}
