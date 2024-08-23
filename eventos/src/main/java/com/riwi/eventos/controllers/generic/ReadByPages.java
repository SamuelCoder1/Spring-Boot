package com.riwi.eventos.controllers.generic;


import com.riwi.eventos.models.Eventos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReadByPages<Entity> {
    ResponseEntity<List<Eventos>> readAll(int page, int size);
}
